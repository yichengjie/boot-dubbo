package com.yicj.study.provider;

import java.io.IOException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.yicj.study.provider.mapper")
@ImportResource(locations="classpath:spring/spring-dubbo.xml")
public class MyApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(MyApplication.class,args) ;
        System.in.read() ;
    }
}
