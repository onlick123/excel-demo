package com.ahead.excel.pojo;

import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/22 19:57
 */
public class demo {
    private String name;
    private List<user> listuser;

    @Override
    public String toString() {
        return "demo{" +
                "name='" + name + '\'' +
                ", listuser=" + listuser +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<user> getListuser() {
        return listuser;
    }

    public void setListuser(List<user> listuser) {
        this.listuser = listuser;
    }
}
