package com.yicj.study.provider.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yicj.study.provider.mapper")
public class MyBatisConfig {


}
