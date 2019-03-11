package com.consumer.controller;

import com.common.api.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/provider/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("get/{id}")
    public User get(@PathVariable("id") Integer id) throws Exception {
        // 使用 Eureka + Ribbon 后，uri 填写服务名称即可
        return restTemplate.getForObject("http://USER-API/provider/user/get/" + id, User.class);
    }

}
