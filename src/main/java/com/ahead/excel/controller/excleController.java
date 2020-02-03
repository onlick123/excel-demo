package com.ahead.excel.controller;



import com.ahead.excel.pojo.user;
import com.ahead.excel.service.excelService;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/19 15:11
 */
@Controller
public class excleController {
    private String msg="";
    @Autowired
    private excelService excerl;
    @RequestMapping("/excel")
   public String excel(){
       return "excel";
   }

   //图书去重操作
   @PostMapping("/upload")
   @ResponseBody
   public Map<String,Object>  upload(@RequestBody String msg){
       System.out.println("请求到了这");
       this.msg=msg;
       Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",true);
        return modelMap;
    }
   private Set<user> getResult(){
        //将未查重的结果查重
       Set<user> result = excerl.result(msg);

       return result;
   }
//   @GetMapping("/isbn")
//    public ModelAndView isbn(Model model){
//    model.addAttribute("users",getResult());
//    model.addAttribute("size",excerl.getSize());
//    int size=excerl.getSize();
//       System.out.println(size);
//    return new ModelAndView("excel","userModel",model);
//   }
    @PostMapping("/isbn")
    @ResponseBody
    //page 和size必须和index.js中的request里的参数相同，形成数据绑定
   public Map<String,Object>  isbn(@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "size",defaultValue = "5") int size){
        List<user> userList = page(page, size);
        int count = excerl.getSize();
        Map<String,Object> model=new HashMap<>();
       //封装成layui异步分页所需要的形式
       model.put("code",0);
       model.put("msg","ok");
       model.put("count",count);
       model.put("data",userList);
     return model;
    }
    //将查重的结果放到list集合中
    private List<user> page(int page,int size){
        List<user> userList=new ArrayList<>(getResult());
        int size1 = userList.size();
        List<user> newResult=new ArrayList<>();
//        for(int i=(page-1)*size;i<=(page*size)-1;i++){
////           if(i< (size1-(size1%size))){
//////               System.out.println("+++++++++++++++++++++++++++++++++++++++++"+(size1-(size1%size)));
//////               newResult.add( userList.get(i));
//////           }else{
//////              for(int j=(size1-(size1%size));j<(size1%size);j++){
//////                  System.out.println("+++++++++++++++++++++++++++++++++++++++++"+(size1-(size1%size)));
//////                  newResult.add(userList.get(j));
//////              }
//////           }
//
//        }
        int i=(page-1)*size;
        if(i< (size1-(size1%size))){
            for(int j=i;j<=(page*size)-1;j++){
                newResult.add( userList.get(i));
            }
        }else{
            for(int x=(size1-(size1%size));x<size1;x++){
                  System.out.println("+++++++++++++++++++++++++++++++++++++++++"+(size1-(size1%size)));
                  newResult.add(userList.get(x));
              }
        }
        return newResult;
    }
    @RequestMapping("/test")
    @ResponseBody
    public String test() throws IOException {

        return "test";
    }
    @GetMapping ("/importtext")
    @ResponseBody
    public String importtext(){
        return JSON.toJSONString(getResult());
    }
}
