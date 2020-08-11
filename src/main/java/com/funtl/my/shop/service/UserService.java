package com.funtl.my.shop.service;

import com.funtl.my.shop.entity.User;

/**
 * @author: TOLUNGKIT
 * @version: 1.0.0
 * @date: 2020-08-12 00:34
 **/
public interface UserService {
    /**
     * 登录
     * @param email 邮箱
     * @param password 密码
     * @return
     */
    public User login(String email, String password);
}
