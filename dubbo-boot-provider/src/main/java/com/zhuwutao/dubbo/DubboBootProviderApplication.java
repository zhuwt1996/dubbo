package com.zhuwutao.dubbo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;


/**
 * Created by zhuwutao on 2019-06-12
 *
 * SpringBoot整合Dubbo：
 *  * 一、
 *  *   1、引入dubbo-boot-starter依赖
 *  *   2、添加@Enable开启Dubbo
 *  *   3、服务提供者@Service暴露服务，服务消费者@Reference调用服务
 *  *二、
 *  *   1、保留dubbo xml配置文件
 *  *   2、@ImportResource 引用xml文件(不需要@Service)
 *
 *  *三、
 *      1、使用注解api的方式，将每个组件手动添加到容器中，并开启扫描(需要@Service)
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.zhuwutao.dubbo")  //开启dubbo\
@EnableHystrix //开启服务降级
//@ImportResource(locations = "classpath:provider.xml")
//@DubboComponentScan(value = "com.zhuwutao.dubbo")
public class DubboBootProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboBootProviderApplication.class,args);
    }
}
