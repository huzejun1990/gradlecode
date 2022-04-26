package com.dream.test;

import com.dream.dao.AccountDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : huzejun
 * @Date: 2022/4/26-17:44
 */
public class AccountTest {

    @Test
    public void accountTest(){
        //得到spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 从容器中得到AccountDao对象
        AccountDao accountDao = ac.getBean(AccountDao.class);
        //调用方法
        accountDao.findAll();
    }
}
