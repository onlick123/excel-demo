package com.ahead.excel.controller;

import com.ahead.excel.pojo.ajaxuser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/2/2 16:38
 */
@Controller
public class ajaxController {
    @RequestMapping("/login")
    @ResponseBody
    public String  login(String username, String password,String callback){

        String responseText=callback+"("+ JSON.toJSONString(new ajaxuser(username,password,"aaa")) +")";
        return responseText;
    }
    @RequestMapping(value = "/login1")
    @ResponseBody
    public String  login1( @RequestBody String msg, HttpServletResponse resp, HttpServletRequest req){

        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        resp.setHeader("Access-Control-Max-Age", "3600");
        resp.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        resp.setHeader("Access-Control-Allow-Credentials", "true");
        ajaxuser ajaxuser = JSON.parseObject(msg, ajaxuser.class);
        String responseText=JSON.toJSONString(new ajaxuser(ajaxuser.getUsername(),ajaxuser.getPassword(),"aaa"));
        return responseText;
    }


}
