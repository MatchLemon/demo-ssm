package com.hy.demo.service;

import com.hy.demo.mapper.UserMapper;
import com.hy.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getOne(Integer id) {
        return userMapper.getUser(id);
    }
    public Integer save(User user) {

        Integer res = userMapper.saveUser(user);
        int s = 1/0;
        return res;
    }


}
