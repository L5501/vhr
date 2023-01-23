package com.ll.vhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ll.vhr.mapper")
@SpringBootApplication
public class VhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrApplication.class, args);
    }

}
