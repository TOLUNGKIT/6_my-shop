package com.funtl.my.shop.dao;

import com.funtl.my.shop.entity.User;

/**
 * @author: TOLUNGKIT
 * @version: 1.0.0
 * @date: 2020-08-12 00:28
 **/
public interface UserDao {
    /**
     * 根据邮箱和密码获取用户信息
     * @param email 邮箱
     * @param passward 密码
     * @return 用户
     */
    public User getUser(String email, String passward);
}
