package com.lics.service;

import com.lics.dao.UserDao;
import com.lics.dao.UserDaoImpl;
import com.lics.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
//    private UserDao userDao =  new UserDaoImpl();
    private UserDao userDao;

    // 利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
