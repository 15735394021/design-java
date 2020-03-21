package com.taru.design1.service.serviceImpl;

import com.taru.design1.dao.UserDao;
import com.taru.design1.model.User;
import com.taru.design1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDaoImpl;

    @Override
    public User login(User user) {
        List<User> users = userDaoImpl.login(user);
        if(users.size() > 0){
            return users.get(0);
        }else{
            return null;
        }
    }
    @Override
    public User regist(User user) {
        Integer regist = userDaoImpl.regist(user);
        if(regist > 0){
            User login = login(user);
            return login;
        }else{
            return null;
        }
    }
    @Override
    public Integer delete(User user) {
        Integer delete = userDaoImpl.delete(user);
        return delete;
    }
    @Override
    public Integer update(User user) {
        return null;
    }
}
