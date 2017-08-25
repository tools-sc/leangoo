package com.team6.leangoo.service;

import com.team6.leangoo.mapper.RoleMapper;
import com.team6.leangoo.mapper.UserMapper;
import com.team6.leangoo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AgZou on 2017/8/24.
 */
@Service
public class UserService {
    @Autowired private UserMapper userMapper;
    //IDEA报错是因为没有找到mapper的实现类,实际上mapper实现类是在编译(不确定?)中生成的,不影响
    public User findUserByName(String username){
        return userMapper.findByUserName(username);
    }
}
