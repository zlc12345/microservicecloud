package com.atguigu.springcloud.myrule;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule
{
	@Bean
	public IRule myRule()
	{
		return new RandomRule();// Ribbon是随机
		//return new RoundRobinRule();// Ribbon默认是轮询
		//return new RandomRule_ZLC();// 我自定义为每台机器5次
	}
}
