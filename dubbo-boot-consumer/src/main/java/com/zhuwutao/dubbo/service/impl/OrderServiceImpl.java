package com.zhuwutao.dubbo.service.impl;

import com.zhuwutao.dubbo.bean.UserAddress;
import com.zhuwutao.dubbo.service.OrderService;
import com.zhuwutao.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhuwutao on 2019-06-05
 */
@Service
public class OrderServiceImpl implements OrderService {

    //url属性：dubbo直连
    @Reference(loadbalance = "roundrobin") //使用dubbo提供的reference注解用于发现服务
    UserService userService;

    public List<UserAddress> initOrder(String userId) {

        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;

    }
}
