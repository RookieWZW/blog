package com.RookieWZW.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RookieWZW
 * @version ����ʱ�䣺2018��8��4�� ����11:07:32 ��˵��
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World! Welcome to visit Rookie.com";
	}
}
