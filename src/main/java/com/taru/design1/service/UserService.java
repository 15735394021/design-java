package com.taru.design1.service;

import com.taru.design1.model.User;

import java.util.List;

public interface UserService {
    //登录
    User login(User user);
    //注册
    User regist(User user);
    //注销，禁用
    Integer delete(User user);
    //更改个人信息
    Integer update(User user);
}
