package com.jerry.gulimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 网关微服务启动类
 *
 * @author junjun.lei
 * @email leijunjun18@163.com
 * @date 2021-03-18 02:23:23
 */
@EnableEurekaClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GulimallGatewayApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(GulimallGatewayApplication.class, args);
    }

}
