package com.jiaolong.login.demo.entity;


/**
 * 用户表
 */
public class User {
    private String username;
    private String logigId;
    private String loginPwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLogigId() {
        return logigId;
    }

    public void setLogigId(String logigId) {
        this.logigId= logigId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", logigID='" + logigId + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                '}';
    }

}
