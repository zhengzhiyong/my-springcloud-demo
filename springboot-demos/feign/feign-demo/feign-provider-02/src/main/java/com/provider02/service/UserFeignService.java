package com.provider02.service;

import com.feign.commonapi.po.User;

public interface UserFeignService {
    User getUserInfo(int id);
}
