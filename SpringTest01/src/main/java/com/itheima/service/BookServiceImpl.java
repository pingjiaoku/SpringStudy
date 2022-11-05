package com.itheima.service;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


/**
 * @description:
 * @time: 1/11/2022 20:00
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    @Override
    public void save(){
        bookDao.save();
        System.out.println("service save ...");
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public BookDao getBookDao(){
        return this.bookDao;
    }
}
