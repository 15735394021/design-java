package com.taru.design1.controller;

import com.taru.design1.model.User;
import com.taru.design1.service.UserService;
import com.taru.design1.util.RedisUtil;
import com.taru.design1.vo.ObjectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userServiceimpl;
    @Resource
    private RedisUtil redisUtil;
    //登录，或注册
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ObjectVo login(User user){
        ObjectVo objectVo = new ObjectVo(0);
        User user1 = userServiceimpl.login(user);
        if(user1 != null){
        redisUtil.set("userId",user1.getUserId());
            objectVo.setData(user1);
        }else{
            User regist = userServiceimpl.regist(user);
            redisUtil.set("userId",regist.getUserId());
            objectVo.setData(regist);
        }
        return objectVo;
    }
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public User regist(User user){
        User regist = userServiceimpl.regist(user);
        return regist;
    }
    //注销
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public ObjectVo cancel(User user){
        ObjectVo objectVo = new ObjectVo(0);
        Integer delete = userServiceimpl.delete(user);
        if(delete > 0){
            boolean delete1 = redisUtil.delete(user.getUserId());
            objectVo.setData(delete1);
        }else{
            objectVo.setMessage("禁用账号失败");
        }
        return objectVo;
    }
    //退出登录
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public ObjectVo logout(User user){
        ObjectVo objectVo = new ObjectVo(0);
        boolean delete1 = false;
        try {
            delete1 = redisUtil.delete(user.getUserId());
            if(!delete1){
                objectVo.setStatus(1);
            }
                return objectVo;
        } catch (Throwable throwable) {
            objectVo.setStatus(1);
            objectVo.setData(throwable);
            return objectVo;
        }
    }
}
