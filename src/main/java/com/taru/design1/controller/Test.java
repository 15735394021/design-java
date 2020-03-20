package com.taru.design1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/hehe")
    public Object test(){

        return "哈哈，爸爸在";
    }
}
