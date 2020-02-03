package com.ahead.excel.pojo;

import java.util.Objects;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/16 21:46
 */
public class userinfo {
    private String id;
    private String name;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        userinfo userinfo = (userinfo) o;
        return password.equals(((userinfo) o).password);
    }

    @Override
    public int hashCode() {
      String in=password;
//      Objects.hash(id, name, password);
        return in.hashCode();
    }

    @Override
    public String toString() {
        return "userinfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
