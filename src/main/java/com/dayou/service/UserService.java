package com.dayou.service;

import com.dayou.entity.User;

import java.sql.SQLException;

/**
 * Author:      TangRui
 * Email:       tr@geektang.cn
 * Date:        2017/6/16
 * Description:
 */
public interface UserService {
    User login(String username, String password) throws SQLException;
}
