package com.feign.provider.service;

import com.feign.commonapi.po.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserFeignServiceImpl implements UserFeignService{

    private static List<User> list = new ArrayList<>();

    static {
        for (int i=1; i<6; i++) {
            list.add(new User(i+1,"zhangsan"+(i+1),"password"+(i+1),8082));
        }
    }

    @Override
    public User getUserInfo(int id) {
        int i = id >= list.size() ? list.size()-1 : (id <=0?0:id);
        return list.get(i);
    }
}
