package com.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;


@Configuration   //类似于applicationContext.xml
public class ConfigBean {

	@Bean
	@LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

//更换ribbon默认的轮询算法
	@Bean
	public IRule myRule()
	{
		//return new RoundRobinRule();//轮询算法
		return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
		//return new RetryRule();//内部机制
	}

}
