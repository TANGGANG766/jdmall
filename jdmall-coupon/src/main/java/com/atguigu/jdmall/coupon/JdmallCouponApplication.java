package com.atguigu.jdmall.coupon;

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


/**
 * 1.how to use Nacos for configuration center,unified management configuration
 *
 * 1).import dependency
 *      <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *  2).creat a bootstrap.properties.  file
 *      spring.application.name=jdmall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *
 *   3).you need to add a data set(Data Id  jdmall-coupon.properties)to the configuration center by default,Application rule ,application.properties
 *   4). for application name.properties put any configuration
 *   5).dynamically get configuration
 *          @RefreshScope:dynamically get and refresh configuration
 *          @Value("$(the name of the configuration item)"):get configuration
 *          If the same items are configured in the configuration center and currently configuration file,
 *          the configuration in the configuration center is preferred.
 *    2.detail
 *      1)Namespaces: configuration isolation
 *          default :public(Reserved space);all new configurations added by default in the  public space.
 *          1.dev,test,prop:use namespaces for environmental isolation
 *          Note: on bootstrap.properties;configuration,which namespace configuration is required .
 *          spring.cloud.nacos.config.namespace=9162e6c7-558d-42ae-bd53-f679259b1306
 *      2)The configuration of each micro service is isolated from each other,and each mirco service creates its own namespace ,
 *          and only loads all the configurations under its own namespace.
 *
 *      2)Configuration set: all configuration set
 *      3)Configuration set ID: similar to the file name.
 *      Data ID: similar to the file name.
 *      4)Configuration group:
 *          By default all configuration sets belong to :DEFAULT_GROUP;
 *          1111,1212,618.
 *       each micro service create own namespace，use configuration groups to distinguish environments,dev test,prod
 *      3)Load multiple configuration sets at the same time
 *          1)any micro service configuration ,any configuration file can put in configuration center
 *          2)only need bootstrap.properties description loading configuration center config file
 *          3) @Value @ConfigurationProperties....
 *              before SpringBoot any method for config files get value,all can use
 *              The configuration center has priority to use the configuration center.
 */



@EnableDiscoveryClient
@SpringBootApplication
public class JdmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdmallCouponApplication.class, args);
    }

}
