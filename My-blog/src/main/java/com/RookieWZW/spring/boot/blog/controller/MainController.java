package com.RookieWZW.spring.boot.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.RookieWZW.spring.boot.blog.domain.Authority;
import com.RookieWZW.spring.boot.blog.domain.User;
import com.RookieWZW.spring.boot.blog.service.AuthorityService;
import com.RookieWZW.spring.boot.blog.service.UserService;

/**
 * @author RookieWZW
 * @version 创建时间：2018年9月3日 下午11:38:26 类说明
 */
@Controller
public class MainController {

	private static final Long ROLE_USER_AUTHORITY_ID = 2L;

	@Autowired
	private UserService userService;

	@Autowired
	private AuthorityService authorityService;

	@GetMapping("/")
	public String root() {
		return "redirect:/index";
	}

	@GetMapping("/index")
	public String index() {
		return "redirect:/blogs";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		model.addAttribute("errorMsg", "登录失败，账号或密码错误");

		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/register")
	public String registerUser(User user) {
		List<Authority> authorities = new ArrayList<>();

		authorities.add(authorityService.getAuthorityById(ROLE_USER_AUTHORITY_ID));

		user.setAuthorities(authorities);

		userService.saveUser(user);

		return "redirect:/login";
	}

	@GetMapping("/search")
	public String search() {
		return "search";
	}

}
