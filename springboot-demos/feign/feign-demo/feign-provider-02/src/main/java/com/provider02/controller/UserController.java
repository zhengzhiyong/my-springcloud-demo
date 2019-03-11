package com.provider02.controller;

import com.feign.commonapi.po.User;
import com.feign.commonapi.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider/user")
public class UserController {

    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("/get/{id}")
    public User get(@PathVariable("id") Integer id) {
        return this.userFeignService.getUserInfo(id);
    }
}
