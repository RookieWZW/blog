package com.RookieWZW.spring.boot.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.RookieWZW.spring.boot.blog.vo.Menu;

/**
 * @author RookieWZW
 * @version ����ʱ�䣺2018��8��4�� ����11:02:55 ��˵��
 */
@Controller
@RequestMapping("/admins")
public class AdminController {

	@GetMapping
	public ModelAndView listUsers(Model model) {
		List<Menu> list = new ArrayList<>();
		list.add(new Menu("�û�����", "/users"));
		list.add(new Menu("��ɫ����", "/roles"));
		list.add(new Menu("���͹���", "/blogs"));
		list.add(new Menu("���۹���", "/commits"));
		model.addAttribute("list", list);

		return new ModelAndView("/admins/index", "model", model);
	}
}
