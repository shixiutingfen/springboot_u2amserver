package com.jiuling.controller;

import com.jiuling.model.User;
import com.jiuling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by fanxiaoming on 2018/7/5.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUser")
    public User getUser(){
        return userService.getUserById();
    }

}
