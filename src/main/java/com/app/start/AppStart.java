package com.app.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 莫小阳
 */
@SpringBootApplication(scanBasePackages = "com.app")
@MapperScan("com.app.mapper")
public class AppStart {

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class, args);
    }

}
