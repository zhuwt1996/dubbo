package com.zhuwutao.dubbo;

import com.zhuwutao.dubbo.service.OrderService;
import com.zhuwutao.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by zhuwutao on 2019-06-07
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        //OrderService orderService = (OrderService) context.getBean(OrderService.class);
        //orderService.initOrder("1");
        System.out.println("调用完成...");
        System.in.read();
    }
}
