package com.jiaolong.login.demo.service;

import com.jiaolong.login.demo.entity.User;

public interface UserService {

    public User login(String loginId,String loginPwd);

}
