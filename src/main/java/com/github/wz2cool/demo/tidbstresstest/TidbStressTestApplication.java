package com.github.wz2cool.demo.tidbstresstest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = "com.github.wz2cool.demo.tidbstresstest.dao")
public class TidbStressTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TidbStressTestApplication.class, args);
    }

}

