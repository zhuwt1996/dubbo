package com.zhuwutao.dubbo.service.impl;

import com.zhuwutao.dubbo.bean.UserAddress;
import com.zhuwutao.dubbo.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhuwutao on 2019-06-05
 */
public class UserServiceImpl2 implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl...new...");
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        return Arrays.asList(address1,address2);
    }
}
