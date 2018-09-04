package com.RookieWZW.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @author RookieWZW
* @version 创建时间：2018年8月19日 上午12:22:15 
* 类说明 
*/
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello world! Welcome to visit RookieWZW.com";
	}
}
 