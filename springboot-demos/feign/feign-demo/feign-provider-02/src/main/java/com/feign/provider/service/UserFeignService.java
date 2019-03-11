package com.feign.provider.service;

import com.feign.api.po.User;

public interface UserFeignService {
    User getUserInfo(int id);
}
