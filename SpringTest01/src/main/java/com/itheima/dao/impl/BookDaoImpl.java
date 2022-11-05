package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

/**
 * @description:
 * @time: 1/11/2022 19:59
 */
public class BookDaoImpl implements BookDao {
    private Integer number;
    private String str;

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void save(){
        System.out.println("BookDao save ... number=" + number + ",str=" + str);
    }
}
