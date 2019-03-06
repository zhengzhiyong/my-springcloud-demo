package com.eureka.consumer.controller;

import com.eureka.po.User;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user/provider")
public class UserController {

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/get/{id}")
    @ResponseBody
    public String getUserInfo(@PathVariable("id") Integer id){
        List<ServiceInstance> list = client.getInstances("USER-API");

        String uri = null;
        for (ServiceInstance instance : list){
            if (null != instance.getUri() && !"".equals(instance.getUri().toString())){
                uri =instance.getUri().toString()+"/user/provider/get/"+id;
                break;
            }
        }
        return restTemplate.getForObject(uri, String.class);
    }

}
