package com.RookieWZW.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日  类说明
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
	    return "Hello World! Welcome to visit RookieWZW.com!";
	}
 
}
 