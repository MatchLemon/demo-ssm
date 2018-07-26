package com.hy.demo.controller;

import com.hy.demo.mapper.UserMapper;
import com.hy.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/test")
    public User test() {
        User user = userMapper.getUser(1);
        return user;
    }
}
