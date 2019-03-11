package com.feign.commonapi.service;

import com.feign.commonapi.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "USER-API")
public interface UserFeignService {
    @RequestMapping("/provider/user/get/{id}")
    User getUserInfo(@PathVariable("id") int id);
}
