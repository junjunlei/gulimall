package com.jerry.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author jerry
 * @Description 会员服务启动类
 * @Date 2021-10-10 13:09
 * @Version 1.0
 **/
@EnableEurekaClient
@SpringBootApplication
public class GulimallMemberApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
