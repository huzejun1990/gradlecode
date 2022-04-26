package com.dream.dao.impl;

import com.dream.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Author : huzejun
 * @Date: 2022/4/27-3:12
 */

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public String save() {
        return "保存成功！";
    }
}
