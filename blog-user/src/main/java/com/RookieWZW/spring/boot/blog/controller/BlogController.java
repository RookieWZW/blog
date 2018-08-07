package com.RookieWZW.spring.boot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author RookieWZW
 * @version ����ʱ�䣺2018��8��4�� ����11:05:09 ��˵��
 */
@Controller
@RequestMapping("/blogs")
public class BlogController {

	@GetMapping
	public String listBlogs(@RequestParam(value = "order", required = false, defaultValue = "new") String order,
			@RequestParam(value = "tag", required = false) Long tag) {
		System.out.println("order :" + order + ";tag: " + tag);
		return "redirect:/index?order=" + order + "&tag=" + tag;
	}
}
