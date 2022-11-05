package com.itheima.factory;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @description:
 * @time: 1/11/2022 16:28
 */
public class UserDaoFactoryBean implements FactoryBean<BookDao> {
    // （必须）获取对象
    @Override
    public BookDao getObject() throws Exception {
        return new BookDaoImpl();
    }

    // （必须）通告返回的对象类型
    @Override
    public Class<?> getObjectType() {
        return BookDao.class;
    }

    // （非必须）控制返回的对象是否为单例，默认为单例（true）
    @Override
    public boolean isSingleton() {
        return true;
    }
}
