package com.szm.service;

import com.szm.pojo.User;

public interface IUserService {
    void regist(User user);

    User findUser(int id);
}
