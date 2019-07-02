package com.szm.service;

import com.szm.mapper.UserMapper;
import com.szm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void regist(User user) {
        userMapper.addUser(user);
    }

    @Override
    public User findUser(int id) {
        return userMapper.queryUserById(1);
    }
}
