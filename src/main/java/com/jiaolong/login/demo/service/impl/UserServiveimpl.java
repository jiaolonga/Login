package com.jiaolong.login.demo.service.impl;

import com.jiaolong.login.demo.dao.UserDao;
import com.jiaolong.login.demo.dao.impl.UserDaoimpl;
import com.jiaolong.login.demo.entity.User;
import com.jiaolong.login.demo.service.UserService;

public class UserServiveimpl implements UserService {

    private UserDao userDao = new UserDaoimpl();

    /**
     * 登录
     * @param loginId
     * @param loginPwd
     * @return
     */
    public User login(String loginId, String loginPwd) {
        return userDao.login(loginId,loginPwd);
    }
}
