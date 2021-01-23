package com.an.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@NoArgsConstructor //lombok 无参构造器
@AllArgsConstructor //lombok 生成全参构造器
@ToString // lombok 生成tostring
@Data //lombok 自动生成get set
@Component //手动装配到springboot 或使用  @EnableConfigurationProperties(Car.class)
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private String price;

}
