package com.ahead.excel.test;


import com.ahead.excel.pojo.user;
import com.ahead.excel.pojo.zyy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/22 13:24
 */
public class test01 {
    //    public static void main(String[] args) {
//       String str="{\"获取excel测试表格\":[{\"password\":\"\",\"id\":\"用户信息列表\",\"username\":\"\"},{\"password\":\"用户密码\",\"id\":\"用户Id\",\"username\":\"用户名\"},{\"password\":\"123\",\"id\":1,\"username\":\"admin\"},{\"password\":\"123\",\"id\":2,\"username\":\"demo\"},{\"password\":\"454\",\"id\":3,\"username\":\"iii\"},{\"password\":\"1241545\",\"id\":4,\"username\":\"大白菜\"},{\"password\":\"1212\",\"id\":5,\"username\":\"大名\"},{\"password\":\"1212\",\"id\":6,\"username\":\"小明\"},{\"password\":\"454\",\"id\":7,\"username\":\"三皇\"},{\"password\":\"41545\",\"id\":8,\"username\":\"弟弟\"},{\"password\":\"454\",\"id\":9,\"username\":\"三皇\"},{\"password\":\"454\",\"id\":10,\"username\":\"三皇\"},{\"password\":\"454\",\"id\":11,\"username\":\"三皇\"}],\"获取excel2用户信息列表 用户Id 用户名 用户密码\":[{\"password\":\"\",\"id\":\"用户信息列表\",\"username\":\"\"},{\"password\":\"用户密码\",\"id\":\"用户Id\",\"username\":\"用户名\"},{\"password\":\"123\",\"id\":1,\"username\":\"sss\"},{\"password\":\"123\",\"id\":2,\"username\":\"a;osjdpos\"},{\"password\":\"454\",\"id\":3,\"username\":\"zhangsan\"},{\"password\":\"1241545\",\"id\":4,\"username\":\"大白菜\"},{\"password\":\"1212\",\"id\":5,\"username\":\"大名\"},{\"password\":\"1212\",\"id\":6,\"username\":\"小明\"},{\"password\":\"454\",\"id\":7,\"username\":\"二傻\"},{\"password\":\"41545\",\"id\":8,\"username\":\"弟弟\"},{\"password\":\"454\",\"id\":9,\"username\":\"大厦\"},{\"password\":\"454\",\"id\":10,\"username\":\"大傻\"},{\"password\":\"454\",\"id\":11,\"username\":\"三皇\"}]}\n";
//       String s = StringUtils.substringBetween(str,"[", "]");
//       System.out.println("["+s+"]");
//        JSONObject jsonObject = JSON.parseObject(s);
//        String string = jsonObject.getString("0");
//        System.out.println(string);
//
//
//
//    }
//    public static void main(String[] args) {
//       String str1="[{\"password\":\"\",\"id\":\"用户信息列表\",\"username\":\"\"},{\"password\":\"用户密码\",\"id\":\"用户Id\",\"username\":\"用户名\"},{\"password\":\"123\",\"id\":1,\"username\":\"admin\"},{\"password\":\"123\",\"id\":2,\"username\":\"demo\"},{\"password\":\"454\",\"id\":3,\"username\":\"iii\"},{\"password\":\"1241545\",\"id\":4,\"username\":\"大白菜\"},{\"password\":\"1212\",\"id\":5,\"username\":\"大名\"},{\"password\":\"1212\",\"id\":6,\"username\":\"小明\"},{\"password\":\"454\",\"id\":7,\"username\":\"三皇\"},{\"password\":\"41545\",\"id\":8,\"username\":\"弟弟\"},{\"password\":\"454\",\"id\":9,\"username\":\"三皇\"},{\"password\":\"454\",\"id\":10,\"username\":\"三皇\"},{\"password\":\"454\",\"id\":11,\"username\":\"三皇\"}]";
////       System.out.println("["+s+"]");
//
//
//        String str = "[{\"id\":\"用户信息列表\",\"username\":\"\",\"password\":\"\"},{\"id\":\"用户Id\",\"username\":\"用户名\",\"password\":\"用户密码\"},{\"id\":1,\"username\":\"admin\",\"password\":\"123\"},{\"id\":2,\"username\":\"demo\",\"password\":\"123\"},{\"id\":3,\"username\":\"iii\",\"password\":\"454\"},{\"id\":4,\"username\":\"大白菜\",\"password\":\"1241545\"},{\"id\":5,\"username\":\"大名\",\"password\":\"1212\"},{\"id\":6,\"username\":\"小明\",\"password\":\"1212\"},{\"id\":7,\"username\":\"三皇\",\"password\":\"454\"},{\"id\":8,\"username\":\"弟弟\",\"password\":\"41545\"},{\"id\":9,\"username\":\"三皇\",\"password\":\"454\"},{\"id\":10,\"username\":\"三皇\",\"password\":\"454\"},{\"id\":11,\"username\":\"三皇\",\"password\":\"454\"}]";
////    JSONObject jsonObject = JSON.parseObject(str);
////    str=jsonObject.getString("0");
////    System.out.println(str);
//        JSONArray array = JSON.parseArray(str1);
//        List<user> users = JSON.parseArray(array.toJSONString(), user.class);
//        System.out.println(users.toString());
//    }
//    public static void main(String[] args) {
//        zyy z=new zyy();
//        user u=new user();
//        u.setId("1");
//        u.setPassword("aa");
//        u.setUsername("ss");
//        List<user> add1=new ArrayList();
//        add1.add(u);
//        z.setName("获取excel测试表格");
//        z.setUserlist(add1);
//
//        zyy z1=new zyy();
//        user u1=new user();
//        u1.setId("2");
//        u1.setPassword("aa1");
//        u1.setUsername("ss1");
//        List<user> add2=new ArrayList();
//        add2.add(u1);
//        z1.setName("获取excel测试表格1");
//        z1.setUserlist(add2);
//
//        List<zyy> zyys=new ArrayList<>();
//        zyys.add(z);
//        zyys.add(z1);
//        String s = JSON.toJSONString(zyys);
//        System.out.println(s);
//    }
}

