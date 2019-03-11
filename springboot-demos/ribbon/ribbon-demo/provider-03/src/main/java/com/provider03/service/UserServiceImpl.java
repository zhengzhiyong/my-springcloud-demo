package com.provider03.service;


import com.common.api.po.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static List<User> list = new ArrayList<>();

    static {
        for (int i=1; i<21; i++) {
            list.add(new User(i,"test" +i , "pwd" + i,8083));
        }
    }

    @Override
    public User getUserInfo(Integer id) {
        return list.get(id);
    }

}
