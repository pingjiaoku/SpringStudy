package com.itheima.factory;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;

/**
 * @description:
 * @time: 1/11/2022 21:50
 */
public class UserDaoFactory {
    public BookDao getDao(){
        return new BookDaoImpl();
    }
}
