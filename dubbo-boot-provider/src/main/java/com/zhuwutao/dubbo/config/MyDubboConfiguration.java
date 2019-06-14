package com.zhuwutao.dubbo.config;

import com.zhuwutao.dubbo.service.UserService;
import org.apache.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuwutao on 2019-06-14
 */
@Configuration
public class MyDubboConfiguration {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-boot-provider");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20080);
        return protocolConfig;
    }

    /*
     *<dubbo:service interface="com.zhuwutao.dubbo.service.UserService"
                   ref="UserServiceImpl" timeout="1000" version="1.0.0" stub="com.zhuwutao.dubbo.stub.UserServiceStub">
        <dubbo:method name="getUserAddressList"></dubbo:method>
    </dubbo:service>
     */
    @Bean
    public ServiceConfig<UserService> serviceConfig(UserService userService){
        ServiceConfig<UserService> serviceConfig = new ServiceConfig();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(userService);
        serviceConfig.setVersion("3.0.0");

        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");

        List<MethodConfig> list = new ArrayList();
        list.add(methodConfig);

        serviceConfig.setMethods(list);
        return serviceConfig;
    }
}
