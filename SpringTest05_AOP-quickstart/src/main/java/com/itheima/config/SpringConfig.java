package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @time: 4/11/2022 9:11
 */
@Configuration
@ComponentScan("com.itheima")
@EnableAspectJAutoProxy // 告诉Spring这里有用注解开发的AOP
public class SpringConfig {
}
