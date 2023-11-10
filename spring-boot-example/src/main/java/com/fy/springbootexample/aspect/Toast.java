package com.fy.springbootexample.aspect;

import com.fy.springbootexample.common.Reply;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author zhufeifei 2023/11/9
 **/

@Component
@Aspect
public class Toast {

	@Before("pointCut()")
	public void beforeMethod() {
		System.out.println("Before");
	}

	@After("pointCut()")
	public void afterMethod() {
		System.out.println("After");
	}

	@Pointcut("execution(public * com.fy.springbootexample.service.impl.TestServiceImpl.*(..))")
	public void pointCut(){}
}
