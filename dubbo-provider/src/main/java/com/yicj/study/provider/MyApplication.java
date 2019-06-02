package com.yicj.study.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations="classpath:spring/spring-dubbo.xml")
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args) ;
    }
}
