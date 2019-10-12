package com.leniao.springboot_vue.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vue")
public class UserController {
    @RequestMapping("/login")
    public Boolean Login(User user){
        System.out.println("用户名"+user.getUsername());
        System.out.println("密码"+user.getPassword());
        return Boolean.TRUE;
    }
}
