package com.fy.springbootexample.service.impl;

import com.fy.springbootexample.common.Response;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhufeifei 2023/11/8
 **/

@Service
public class TransactionServiceImpl {
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Response methodB() {
		throw new RuntimeException("异常");
	}
}
