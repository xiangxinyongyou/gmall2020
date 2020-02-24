package com.zy.gmall2020.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zy.gmall2020.user.mapper")
@ComponentScan(basePackages ="com.zy.gmall2020")
public class Gmall2020UserManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(Gmall2020UserManageApplication.class, args);
    }
}



