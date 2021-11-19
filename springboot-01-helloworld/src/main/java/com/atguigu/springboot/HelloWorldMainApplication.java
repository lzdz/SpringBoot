package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 刘振东
 * @create 2021-11-19 15:07
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
// Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
