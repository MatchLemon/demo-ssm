package com.hy.demo.controller;

import com.hy.demo.models.User;
import com.hy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test")
    public User test() {
        User user = userService.getOne(1);
        return user;
    }

    @RequestMapping("/save")
    public User save() {
        User user = new User();
        user.setAge(22);
        user.setGender("男");
        user.setUsername("王二");
        userService.save(user);
        return user;

    }
}
