package com.ahead.excel.service.impl;

import com.ahead.excel.pojo.user;
import com.ahead.excel.service.excelService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/24 16:23
 */
@Service
public class excelServiceImpl implements excelService {
    private int size;
    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Set<user> result(String msg) {
        //将json 字符串转换成json对象
        JSONObject jsonObject = JSON.parseObject(msg);
        //将最外层的”0“去除掉
        String string = jsonObject.getString("0");
        //将json对象转换成map对象 注意 --》里面的list<user>并没有转换
        Map<String, List<user>> zyy = JSON.parseObject(string, Map.class);
        //这一步是为了去重 重写了user里的equal和hashcode方法
        Set<user> userSet=new HashSet<>();
        //遍历map对象
        for(Map.Entry<String,List<user>> value:zyy.entrySet()){
            //将map中的valus转换成list<user>对象
            List<user> users = JSON.parseArray((value.getValue()).toString(), user.class);
            for(int i=1;i<users.size();i++){
                //i=1是为了将第一行数据去除
                userSet.add(users.get(i));
            }
        }
       size=userSet.size();

//        System.out.println("zy"+size);
//        //这里只是为了遍历set
//        Iterator<user> it = userSet.iterator();
//        while(it.hasNext()){
//            user next = it.next();
//            System.out.println(next.getUsername());
//        }

        return userSet;
    }
}
