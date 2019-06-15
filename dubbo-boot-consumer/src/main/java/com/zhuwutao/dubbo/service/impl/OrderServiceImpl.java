package com.zhuwutao.dubbo.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhuwutao.dubbo.bean.UserAddress;
import com.zhuwutao.dubbo.service.OrderService;
import com.zhuwutao.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhuwutao on 2019-06-05
 */
@Service
public class OrderServiceImpl implements OrderService {

    //url属性：dubbo直连
    @Reference(loadbalance = "roundrobin") //使用dubbo提供的reference注解用于发现服务
    UserService userService;

    @HystrixCommand(fallbackMethod = "hello")
    public List<UserAddress> initOrder(String userId) {

        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;

    }

    public List<UserAddress> hello(String userId) {

        return Arrays.asList(new UserAddress(10,"测试地址","测试id","测试收货人","电话号码","Y"));

    }
}
