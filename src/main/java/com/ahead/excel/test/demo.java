package com.ahead.excel.test;

import com.ahead.excel.pojo.user;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/22 19:02
 */
public class demo {
    public static void main(String[] args) {
        Set<user> userset=new HashSet<>();
        List<user>  list=new ArrayList<>();

        user u=new user();
        u.setId("1");
        u.setUsername("aa1");
        u.setPassword("11");
        user u1=new user();
        u1.setId("2");
        u1.setUsername("aa2");
        u1.setPassword("11");
        user u2=new user();
        u2.setId("3");
        u2.setUsername("a3a");
        u2.setPassword("11");
        user u3=new user();
        u3.setId("4");
        u3.setUsername("aa4");
        u3.setPassword("11");
        list.add(u);
        list.add(u2);
        list.add(u3);
        list.add(u1);

        userset.addAll(list);
        System.out.println(userset.size());
    }
}
