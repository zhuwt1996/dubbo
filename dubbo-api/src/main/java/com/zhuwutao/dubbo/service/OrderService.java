package com.zhuwutao.dubbo.service;

import com.zhuwutao.dubbo.bean.UserAddress;

import java.util.List;

public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);
}
