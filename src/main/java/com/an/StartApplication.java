package com.an;

import com.an.bean.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// scanBasePackages 可以指定需要扫描哪个文件夹
@SpringBootApplication(scanBasePackages = "com.an")
public class StartApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(StartApplication.class,args);


        System.out.println(run.getBean(Car.class).toString());
    }
}
