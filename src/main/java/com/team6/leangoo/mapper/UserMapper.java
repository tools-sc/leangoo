package com.team6.leangoo.mapper;

import com.team6.leangoo.model.User;
import com.team6.leangoo.util.MyMapper;

public interface UserMapper extends MyMapper<User> {
    public User findByUserName(String username);

}