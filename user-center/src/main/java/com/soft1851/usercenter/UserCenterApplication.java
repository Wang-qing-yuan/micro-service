package com.soft1851.usercenter;


import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan(basePackages = "com.soft1851.usercenter.dao") // 注意，要换成 tk 提供的 @MapperScan 注解
public class UserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }

}