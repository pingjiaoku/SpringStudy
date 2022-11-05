package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @description:
 * @time: 1/11/2022 19:59
 */
//@Scope("prototype" /*singleton*/)
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save(){
        System.out.println("BookDao save ... ");
    }


//    @PostConstruct
//    public void init(){
//        System.out.println("init ...");
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("destroy ...");
//    }

}
