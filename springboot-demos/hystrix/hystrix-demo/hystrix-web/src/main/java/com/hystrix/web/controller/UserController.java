package com.hystrix.web.controller;

import com.hystrix.api.po.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUserInfo/{id}")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "getFallBack",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "500")
    })
    public User getUserInfo(@PathVariable("id") long id) throws Exception{
        Thread.sleep(id);
        return new User(Long.valueOf(id).intValue(),"张三"+id,"password"+id);
    }

    public String getFallBack(@PathVariable("id") long id) {
        return "getFallBack";
    }

}
