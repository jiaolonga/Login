package com.jiaolong.login.demo.dao;

import com.jiaolong.login.demo.entity.User;

/**
 * 用户数据访问
 */
public interface UserDao {
    public User login(String loginId, String loginPwd);
}
