package com.dream.service.impl;


import com.dream.dao.UserDao;
import com.dream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : huzejun
 * @Date: 2022/4/27-3:07
 */
@Service
public class UserServiceImpl implements UserService {

/*    @Autowired
    private UserDao userDao;*/
    @Autowired
    private UserDao userDao;

    @Override
    public String save() {
        return null;
    }
}
