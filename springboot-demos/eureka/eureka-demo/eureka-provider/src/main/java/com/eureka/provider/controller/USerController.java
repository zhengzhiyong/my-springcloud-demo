package com.eureka.provider.controller;

import com.eureka.po.User;
import com.eureka.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/provider")
public class USerController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get/{id}")
    @ResponseBody
    public User getUserInfo(@PathVariable("id") Integer id){
        return userService.getUserInfo(id);
    }
}
