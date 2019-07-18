package com.hand.yz24580.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hand.yz24580.ssm.mapper")
@SpringBootApplication
public class SsmApplication {
    public static void main(String[] args){
        SpringApplication.run(SsmApplication.class,args);
    }
}
