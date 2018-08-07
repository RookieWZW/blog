package com.RookieWZW.spring.boot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author RookieWZW
 * @version ����ʱ�䣺2018��8��4�� ����10:19:52 ��˵��
 */

@Controller
@RequestMapping("/admins")
public class AdminController {

	@GetMapping
	public ModelAndView listUsers(Model model) {
		return new ModelAndView("admins/index", "menuList", model);
	}
}
