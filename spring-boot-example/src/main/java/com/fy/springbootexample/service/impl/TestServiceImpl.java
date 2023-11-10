package com.fy.springbootexample.service.impl;

import com.fy.springbootexample.common.Reply;
import com.fy.springbootexample.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhufeifei 2023/11/8
 **/

@Service
public class TestServiceImpl {

	@Autowired
	private TransactionServiceImpl service;


	@Transactional(rollbackFor = Exception.class)
	public Response methodA() {
		service.methodB();
		System.out.println("继续执行，不受影响");
		return Reply.ok();
	}
}
