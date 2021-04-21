package com.atguigu.jdmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;



/*
 * 想要远程调用的步骤：
 * 1 引入openfeign
 * 2 编写一个接口，接口告诉springcloud这个接口需要调用远程服务
 * 	2.1 在接口里声明@FeignClient("gulimall-coupon")他是一个远程调用客户端且要调用coupon服务
 * 	2.2 要调用coupon服务的/coupon/coupon/member/list方法
 * 3 开启远程调用功能 @EnableFeignClients，要指定远程调用功能放的基础包
 * */

@EnableFeignClients(basePackages ="com.atguigu.jdmall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class JdmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdmallMemberApplication.class, args);
    }

}
