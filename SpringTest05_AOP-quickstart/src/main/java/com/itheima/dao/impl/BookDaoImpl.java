package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @time: 4/11/2022 9:12
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public Integer update(int a, String b){
        System.out.println(a + "," + b);
        System.out.println("update ...");
        return 0;
    }

}
