package com.yicj.study.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//location和value等效
@ImportResource("classpath:spring/spring-dubbo.xml")
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args) ;
    }
}
