package com.ahead.excel.pojo;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/2/2 16:39
 */
public class ajaxuser {
    private String username;
    private String password;
    private String nick;

    public ajaxuser(String username ,String password,String nick){
        this.username=username;
        this.password=password;
        this.nick=nick;

    }
    @Override
    public String toString() {
        return "ajaxuser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nick='" + nick + '\'' +
                '}';
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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
