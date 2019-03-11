package com.feign.provider.service;

import com.feign.commonapi.po.User;

public interface UserFeignService {
    User getUserInfo(int id);
}
