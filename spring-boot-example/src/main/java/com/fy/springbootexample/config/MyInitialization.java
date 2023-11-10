package com.fy.springbootexample.config;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zhufeifei 2023/11/8
 **/

public class MyInitialization implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("初始化#########################3");
	}
}
