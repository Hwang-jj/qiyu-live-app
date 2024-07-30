package org.qiyu.live.api;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
  * @ClassName ApiWebApplication
  * @description: TODO
  * @author Hwangjj
  * @date 2024/7/30 下午3:41
  * @version: 1.0
  */ 

@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo
public class ApiWebApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApiWebApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.SERVLET);
        springApplication.run(args);
    }
}
