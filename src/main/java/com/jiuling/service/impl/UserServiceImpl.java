package com.jiuling.service.impl;

import com.jiuling.mapper.UserMapper;
import com.jiuling.model.User;
import com.jiuling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fanxiaoming on 2018/7/5.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    public User getUserById() {
        return userMapper.selectByPrimaryKey(1);
    }
}
