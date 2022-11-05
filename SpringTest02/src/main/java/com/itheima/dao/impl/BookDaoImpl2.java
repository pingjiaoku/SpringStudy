package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @time: 3/11/2022 0:32
 */
@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Value("${jdbc.url}")
    private String str;

    @Override
    public void save(){
        System.out.println("BookDao save ... 2 —— str=" + str);
    }
}









