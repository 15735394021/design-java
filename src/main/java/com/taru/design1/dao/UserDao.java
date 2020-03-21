package com.taru.design1.dao;

import com.taru.design1.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    //登录
    List<User> login(User user);
    //注册
    Integer regist(User user);
    //注销，禁用
    Integer delete(User user);
    //更改个人信息
    Integer update(User user);
}
