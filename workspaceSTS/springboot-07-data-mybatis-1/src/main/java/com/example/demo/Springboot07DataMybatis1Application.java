package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(value="com.example.demo.mapper")
@EnableTransactionManagement  //启动事务管理器
@SpringBootApplication
public class Springboot07DataMybatis1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot07DataMybatis1Application.class, args);
	}
}
