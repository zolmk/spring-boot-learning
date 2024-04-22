package com.fy.springbootexample;

import com.fy.springbootexample.common.Reply;
import com.fy.springbootexample.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhufeifei 2023/11/6
 **/

@SpringBootApplication
@EnableTransactionManagement
@ImportResource
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
