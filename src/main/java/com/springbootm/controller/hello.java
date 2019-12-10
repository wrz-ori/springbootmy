package com.springbootm.controller;

import com.springbootm.entity.User;
import com.springbootm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2019/12/2.
 */
@Controller
public class hello {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/get")
    public User getUser( ){
        System.out.println("userMapper.getUserByid(0) = " + userMapper.getUserByid(0));
    return userMapper.getUserByid(0);

    }
}
