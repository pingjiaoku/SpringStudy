package com.itheima.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description:
 * @time: 5/11/2022 9:42
 */
@Configuration
@PropertySource({"classpath:jdbc.properties"})
@ComponentScan("com.itheima")
@Import({MybatisConfig.class, JdbcConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
