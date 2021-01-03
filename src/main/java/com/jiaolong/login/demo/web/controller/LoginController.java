package com.jiaolong.login.demo.web.controller;

import com.jiaolong.login.demo.entity.User;
import com.jiaolong.login.demo.service.UserService;
import com.jiaolong.login.demo.service.impl.UserServiveimpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    private UserService userService = new UserServiveimpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginId = req.getParameter("loginId");
        String loginPwd = req.getParameter("loginPwd");

        User user = userService.login(loginId, loginPwd);

        //登录成功的处理
        if (user == null) {
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }
        //登录失败处理
        else {
            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        }


    }
}
