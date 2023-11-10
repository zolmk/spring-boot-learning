package com.fy.springbootexample.common;

import org.springframework.stereotype.Component;

/**
 * @author zhufeifei 2023/11/8
 **/

@Component
public class Reply {
	public static final int CODE_OK = 200;

	public static final int CODE_FAIL = -1;

	public static Response ok() {
		return ok(null);
	}

	public static Response ok(Object data) {
		return new Response(CODE_OK, "OK", data);
	}

	public static Response fail() {
		return fail("fail");
	}

	public static Response fail(String message) {
		return new Response(CODE_FAIL, message, null);
	}
}
