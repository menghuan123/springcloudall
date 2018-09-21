package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //将服务注册到eureka Client端
@EnableDiscoveryClient //服务发现
public class DeptProvider8003_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8003_App.class, args);
	}

}
