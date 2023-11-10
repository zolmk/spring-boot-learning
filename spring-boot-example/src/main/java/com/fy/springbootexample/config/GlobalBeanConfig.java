package com.fy.springbootexample.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author zhufeifei 2023/11/6
 **/
@Configuration
@PropertySource(value = "classpath:my.properties")
public class GlobalBeanConfig implements InitializingBean {
	@Value("g.a.value")
	private String name;


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(name);
	}
}
