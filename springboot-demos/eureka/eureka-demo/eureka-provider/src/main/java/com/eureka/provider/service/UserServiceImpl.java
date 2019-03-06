package com.eureka.provider.service;

import com.eureka.po.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    public static List<User> userList = new ArrayList(20);
    static {
        for (int i = 0;i<20;i++){
            userList.add(new User((i+1),"zhangsan"+(i+1),"password"+(i+1)));
        }
    }
    @Override
    public User getUserInfo(Integer id){
        int i = id > (userList.size()) ? (userList.size()-1):id;
        return userList.get(i);
    }
}
