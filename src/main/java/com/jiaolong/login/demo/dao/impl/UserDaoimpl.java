package com.jiaolong.login.demo.dao.impl;

import com.jiaolong.login.demo.dao.UserDao;
import com.jiaolong.login.demo.entity.User;

/**
 * 用户登录
        */
public class UserDaoimpl implements UserDao {
    public User login(String loginId, String loginPwd) {

        User user = null;


        //直接根据LoginId查询出用户信息
        if ("admin".equals(loginId)) {
            if ("admin".equals(loginPwd)) {
                user = new User();
                user.setLogigId("admin");
                user.setLoginPwd("admin");
                user.setUsername("Jiaolong");
            }
        }
        return user;
    }
}
