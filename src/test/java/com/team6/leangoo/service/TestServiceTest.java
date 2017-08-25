package com.team6.leangoo.service;

import com.team6.leangoo.mapper.UserMapper;
import com.team6.leangoo.model.Permission;
import com.team6.leangoo.model.Role;
import com.team6.leangoo.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by AgZou on 2017/8/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestServiceTest {
    @Autowired private UserMapper userMapper;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        User user=userMapper.selectByPrimaryKey(3);
        System.out.println(userMapper.delete(user));

       }
    }
