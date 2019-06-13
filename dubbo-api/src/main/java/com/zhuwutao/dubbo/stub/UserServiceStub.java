package com.zhuwutao.dubbo.stub;



import com.zhuwutao.dubbo.bean.UserAddress;
import com.zhuwutao.dubbo.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by zhuwutao on 2019-06-13
 */
public class UserServiceStub implements UserService{

    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    public List<UserAddress> getUserAddressList(String userId) {
        if (!StringUtils.isEmpty(userId)){
            System.out.println("stub...");
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
