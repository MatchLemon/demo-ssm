package com.hy.demo.mapper;

import com.hy.demo.models.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUser(Integer id);

    Integer saveUser(User user);
}
