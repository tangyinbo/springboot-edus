package com.cowboy.springbootedus.controller;

import com.cowboy.springbootedus.domain.User;
import com.cowboy.springbootedus.service.UserService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by cowboy on 2017-11-5.
 */
@RestController
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public Page hello(){
        return userService.getUserLists(new User());
    }
    @RequestMapping("/addUser")
    public String addUser(){
        User user = new User();
        user.setName("bobp");
        user.setUserName("kaka");
        user.setAge(11);
        user.setBirthday(new Date());
        userService.insertUser(user);
        return user.getUserId()+"";
    }
}
