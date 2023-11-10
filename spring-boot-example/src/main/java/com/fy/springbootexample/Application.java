package com.fy.springbootexample;

import com.fy.springbootexample.common.Reply;
import com.fy.springbootexample.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhufeifei 2023/11/6
 **/

@SpringBootApplication
@EnableTransactionManagement
public class Application implements CommandLineRunner {

	@Autowired
	public TestServiceImpl service;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Thread.sleep(10000);
		System.out.println("#####################");
		service.methodA();
	}
}
