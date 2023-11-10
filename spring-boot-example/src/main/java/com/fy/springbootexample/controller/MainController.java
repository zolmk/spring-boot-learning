package com.fy.springbootexample.controller;

import com.fy.springbootexample.common.Response;
import com.fy.springbootexample.service.impl.TestServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhufeifei 2023/11/8
 **/

@Api(value = "主要的测试控制器")
@RestController
@RequestMapping("/test")
public class MainController {
	@Autowired
	private TestServiceImpl testService;


	@GetMapping("/transaction")
	@ResponseBody
	public Response testTransaction() {
		return testService.methodA();
	}
}
