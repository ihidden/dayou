package com.dayou.serviceImpl;

import com.dayou.dao.UserDao;
import com.dayou.entity.User;
import com.dayou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * Author:      TangRui
 * Email:       tr@geektang.cn
 * Date:        2017/6/16
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 开启事务则加Transactional注解，若不需要事务控制则不要加此注解
     * @param username 用户名
     * @param password 密码
     * @return 用户信息
     * @throws SQLException
     */
    @Transactional
    public User login(String username, String password) throws SQLException {
        return userDao.login(username, password);
    }
}
