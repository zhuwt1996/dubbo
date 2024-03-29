package com.zhuwutao.dubbo;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by zhuwutao on 2019-06-12
 */
@SpringBootApplication
@EnableDubbo
@EnableHystrix
public class DubboBootConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboBootConsumerApplication.class,args);
    }
}
