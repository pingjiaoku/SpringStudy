package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @time: 4/11/2022 9:33
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = ctx.getBean(BookDao.class);

//        System.out.println(bean);
//        System.out.println(bean.getClass());

        System.out.println("return=" + bean.update(1, "fasldf"));
        ;

//        Object obj = method();
//        System.out.println(obj);
    }

    public static Object method(){
        System.out.println("hhh");
        return Void.class;
    }
}
