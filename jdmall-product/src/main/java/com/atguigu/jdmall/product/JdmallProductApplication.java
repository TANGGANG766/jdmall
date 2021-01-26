package com.atguigu.jdmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;









@MapperScan("com.atguigu.jdmall.product.dao")
@SpringBootApplication
public class JdmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdmallProductApplication.class, args);
    }

}
