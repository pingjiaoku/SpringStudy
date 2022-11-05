package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description: 共性功能
 * @time: 4/11/2022 9:11
 */
@Component // 识别为Bean
@Aspect // 提示Spring这个类是个AOP的通知类
public class MyAdvice {

    // 切入点
//    @Pointcut("execution(void com.itheima.dao.BookDao.update())") // 精准匹配
//    @Pointcut("execution(* com.itheima.dao.BookDao.*())") // BookDao类下所有方法
//    @Pointcut("execution(* com.itheima.dao.*.*())") // dao包下所有类的方法
//    @Pointcut("execution(* com..update())") // com包下所有子孙类的方法
//    @Pointcut("execution(* com.itheima.dao.BookDao.update(int))") // 参数类型为int的方法
//    @Pointcut("execution(* com.itheima.dao.BookDao.update(int, String))") // 参数有两个，类型为int和String的方法
//    @Pointcut("execution(* com.itheima.dao.BookDao.update(..))") // 所有update的重构方法
    @Pointcut("execution(* *..*(..))") // 项目中所有方法
    private void fn(){}

    // 切面：绑定切入点
//    @After("fn()") // 将method放在fn的后面
//    @Before("fn()") // 将method放在fn的前面，与After冲突，后面的覆盖前面的
    //    @AfterReturning("fn()")
//    @AfterThrowing("fn()")

    @Around("fn()")
    public Object method(ProceedingJoinPoint pjp) throws Throwable { // 通知
        // 获取参数
        Object[] args = pjp.getArgs();
        // 处理参数
        if(args.length > 0) {
            if(args[0] instanceof Integer)
                args[0] = 11234;
            if(args[1].getClass().equals(String.class))
                args[1] = "string";
        }
        // 传入参数、执行原方法，并获取返回值
        Integer proceed = (Integer)pjp.proceed(args);
        // 处理返回值
        proceed += 1;
        // 返回返回值
        return proceed;
    }

//    @After("fn()") // 将method放在fn的后面
    public void afMd() {
        System.out.println("end");
    }
}
