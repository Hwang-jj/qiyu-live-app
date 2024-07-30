package org.qiyu.live.user.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
  * @ClassName UserProviderApplication
  * @description: 用户中台服务提供
  * @author Hwangjj
  * @date 2024/7/30 下午2:23
  * @version: 1.0
  */ 

@SpringBootApplication
@EnableDubbo //dubbo
@EnableDiscoveryClient //注册中心
public class UserProviderApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(UserProviderApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }
}
