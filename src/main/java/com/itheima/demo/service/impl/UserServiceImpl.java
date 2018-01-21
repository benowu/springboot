package com.itheima.demo.service.impl;

import com.itheima.demo.mapper.UserMapper;
import com.itheima.demo.pojo.User;
import com.itheima.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }
}
