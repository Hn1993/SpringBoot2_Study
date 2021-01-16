package com.an.config;

import com.an.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

// proxyBeanMethods = true  代理模式  full lite (true false)
@Configuration(proxyBeanMethods = true)
//@EnableConfigurationProperties(Car.class) // Properties 是否自动装配到 springboot
public class MyConfig {
    @Autowired
    private Car car;
}
