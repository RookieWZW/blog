package com.RookieWZW.spring.boot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日  类说明
 */
@Controller
@RequestMapping("/blogs")
public class BlogController {
 
	
	@GetMapping
	public String listBlogs(@RequestParam(value="order",required=false,defaultValue="new") String order,
			@RequestParam(value="tag",required=false) Long tag) {
		System.out.print("order:" +order + ";tag:" +tag );
		return "redirect:/index?order="+order+"&tag="+tag;
	}
 
}
