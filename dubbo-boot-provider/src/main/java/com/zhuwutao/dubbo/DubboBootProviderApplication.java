package com.zhuwutao.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by zhuwutao on 2019-06-12
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.zhuwutao.dubbo")  //开启dubbo

public class DubboBootProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboBootProviderApplication.class,args);
    }
}
