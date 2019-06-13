package com.zhuwutao.dubbo.web;

import com.zhuwutao.dubbo.bean.UserAddress;
import com.zhuwutao.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhuwutao on 2019-06-12
 */
@Controller
public class DubboController {

    @Autowired
    OrderService orderService;


    @ResponseBody
    @RequestMapping("/dubbo")
    public List<UserAddress> getUserAddressList(@RequestParam("uid") String id){
        return orderService.initOrder(id);
    }

}
