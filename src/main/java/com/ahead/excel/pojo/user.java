package com.ahead.excel.pojo;

import java.util.List;
import java.util.Objects;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/1/22 12:54
 */
public class user {
    private String id;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "user{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user user = (user) o;
        return password.equals(((user) o).password);
    }

    @Override
    public int hashCode() {
        String in=password;
//      Objects.hash(id, name, password);
        return in.hashCode();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
