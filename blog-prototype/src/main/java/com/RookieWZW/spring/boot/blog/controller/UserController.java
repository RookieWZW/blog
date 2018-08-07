package com.RookieWZW.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author RookieWZW
 * @version ����ʱ�䣺2018��8��4�� ����10:25:02 ��˵��
 */

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public ModelAndView list() {
		return new ModelAndView("users/list");
	}
}
