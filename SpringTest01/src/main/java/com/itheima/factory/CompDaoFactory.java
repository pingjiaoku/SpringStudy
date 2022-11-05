package com.itheima.factory;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;

/**
 * @description:
 * @time: 1/11/2022 21:22
 */
public class CompDaoFactory {
    public static BookDao getDao(){
        System.out.println("factory setup ...");
        return new BookDaoImpl();
    }
}
