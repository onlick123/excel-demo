layui.use(['jquery', 'layer', 'upload', 'excel', 'laytpl', 'element', 'code','table'], function(){
  var $ = layui.jquery;
  var layer = layui.layer;
  var upload = layui.upload;
  var excel = layui.excel;
  var laytpl = layui.laytpl;
  var element = layui.element;
  var table=layui.table;
  /**
   * 页面加载事件
   */
  function uploadExcel(files) {
    try {
      excel.importExcel(files, {
        // 读取数据的同时梳理数据
        fields: {
          'id': 'A'
          ,'username': 'B'
          ,'password': 'C'

        }
      }, function(data) {

        // 如果不需要展示直接上传，可以再次 $.ajax() 将JSON数据通过 JSON.stringify() 处理后传递到后端即可
        $.ajax({
          type:"POST",
          url: '/upload'
          , data:JSON.stringify(data)
          , dataType: 'json'
          ,contentType : "application/json"
          , success: function (data) {
            if(data.success){
              layer.msg('导入成功',{icon:1,time:1000});
            }
          }
        })
        //展示表格文件转换成的json数据格式
        layer.open({
          type:1,
          title: '文件转换结果'
          ,area: ['799px', '399px']
          ,tipsMore: false
          ,content: laytpl($('#LAY-excel-export-ans').html()).render({data: data, files: files})
          ,success: function() {
            element.render('tab');
            layui.code({
            });
          }
        });
      });
    } catch (e) {
      layer.alert(e.message);
    }
  }


  $(function(){
    // 监听上传文件的事件
    $('#LAY-excel-import-excel').change(function(e) {
      var files = e.target.files;
      uploadExcel(files);
    });
    // 文件拖拽
    $('body')[0].ondragover = function(e) {
      e.preventDefault();
    }
    $('body')[0].ondrop = function(e) {
      e.preventDefault();
      var files = e.dataTransfer.files;
      uploadExcel(files);
    }
    //监听点击事件
    $('#isbn').click(function () {
      table.render({
        elem: '#demo'
        , url: '/isbn' //数据接口
        , method: 'post'
        , page: true //开启分页
        , limits: [2, 3, 5]
        , cols: [[
          { field: 'id', width: 80, title: 'ID', sort: true },
          { field: 'username', title: '用户名'},
          { field: 'password', title: '密码'}
        ]]
        ,
        request:{
          pageName :'page',
          limitName: 'size'
        }
      });
    });
    $('#test').click(function () {
      $.ajax({
        url: '/importtext'
        , dataType: 'json'
        , success: function (res) {
          var data = res
          // 重点！！！如果后端给的数据顺序和映射关系不对，请执行梳理函数后导出
          data = excel.filterExportData(data, {
            id: 'id'
            , username: 'username'
            , password: 'password'
          })
          // 重点2！！！一般都需要加一个表头，表头的键名顺序需要与最终导出的数据一致
          data.unshift({
            id: "ID",
            username: "用户名",
            password: '密码',
          })

          var timestart = Date.now()
          excel.exportExcel({
            sheet1: data
          }, '导出接口数据.xlsx', 'xlsx')
          var timeend = Date.now()

          var spent = (timeend - timestart) / 1000
          layer.alert('单纯导出耗时 ' + spent + ' s')
        }
        , error: function () {
          layer.alert('获取数据失败，请检查是否部署在本地服务器环境下')
        }
      })
    });
  });
})

