package com.RookieWZW.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日 上午10:25:02 类说明
 */

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public ModelAndView list() {
		return new ModelAndView("users/list");
	}
}
