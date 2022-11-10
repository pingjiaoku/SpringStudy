package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.AccountMapper;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @description:
 * @time: 5/11/2022 10:22
 */
public class test {


    @Test
    public void methodTest(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService bean = ctx.getBean(AccountService.class);

        try {
            bean.transfer(1,2, 100L);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
