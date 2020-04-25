package com.han.springcloud;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



//启动类
@SpringBootApplication
@EnableEurekaClient   //服务启动后会自动注册到Eureka中
public class DeptProvider_8001{
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001.class,args);
    }

}


