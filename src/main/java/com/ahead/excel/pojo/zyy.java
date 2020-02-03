package com.ahead.excel.pojo;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/22 16:23
 */
public class zyy {
    private String name;
    private List<user> userlist;

    @Override
    public String toString() {
        return "zyy{" +
                "name='" + name + '\'' +
                ", userlist=" + userlist +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<user> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<user> userlist) {
        this.userlist = userlist;
    }
}
