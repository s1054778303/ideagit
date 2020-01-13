package com.funtl.hello.spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@MapperScan("com.funtl.hello.spring.boot.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HelloSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringbootApplication.class, args);
    }

}
