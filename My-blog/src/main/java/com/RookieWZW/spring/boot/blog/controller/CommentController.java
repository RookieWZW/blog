package com.RookieWZW.spring.boot.blog.controller;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.RookieWZW.spring.boot.blog.domain.Blog;
import com.RookieWZW.spring.boot.blog.domain.Comment;
import com.RookieWZW.spring.boot.blog.domain.User;
import com.RookieWZW.spring.boot.blog.service.BlogService;
import com.RookieWZW.spring.boot.blog.service.CommentService;
import com.RookieWZW.spring.boot.blog.util.ConstraintViolationExceptionHandler;
import com.RookieWZW.spring.boot.blog.vo.Response;

/**
 * @author RookieWZW
 * @version 创建时间：2018年9月3日 下午11:26:45 类说明
 */
@Controller
@RequestMapping("/comments")
public class CommentController {

	@Autowired
	private BlogService blogService;

	@Autowired
	private CommentService commentService;

	@GetMapping
	public String listComments(@RequestParam(value = "blogId", required = true) Long blogId, Model model) {

		Blog blog = blogService.getBlogById(blogId);
		List<Comment> comments = blog.getComments();

		String commentOwner = "";
		if (SecurityContextHolder.getContext().getAuthentication() != null
				&& SecurityContextHolder.getContext().getAuthentication().isAuthenticated() && !SecurityContextHolder
						.getContext().getAuthentication().getPrincipal().toString().equals("anonymousUser")) {
			User principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (principal != null) {
				commentOwner = principal.getUsername();
			}
		}

		model.addAttribute("commentOwner", commentOwner);

		model.addAttribute("comments", comments);

		return "/userspace/blog :: #mainContainerReplace";
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	public ResponseEntity<Response> createComment(Long blogId, String commentContent) {
		try {
			blogService.createComment(blogId, commentContent);

		} catch (ConstraintViolationException e) {
			return ResponseEntity.ok().body(new Response(false, ConstraintViolationExceptionHandler.getMessage(e)));
		} catch (Exception e) {
			return ResponseEntity.ok().body(new Response(false, e.getMessage()));
		}

		return ResponseEntity.ok().body(new Response(true, "处理成功", null));
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_USER')")
	public ResponseEntity<Response> delete(@PathVariable("id") Long id, Long blogId) {

		boolean isOwner = false;

		User user = commentService.getCommentById(id).getUser();
		if (SecurityContextHolder.getContext().getAuthentication() != null
				&& SecurityContextHolder.getContext().getAuthentication().isAuthenticated() && !SecurityContextHolder
						.getContext().getAuthentication().getPrincipal().toString().equals("anonymousUser")) {
			User principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (principal != null && user.getUsername().equals(principal.getUsername())) {
				isOwner = true;
			}
		}

		if (!isOwner) {
			return ResponseEntity.ok().body(new Response(false, "没有操作权限"));
		}
		try {
			blogService.removeComment(blogId, id);
			commentService.removeComment(id);
		} catch (ConstraintViolationException e) {
			return ResponseEntity.ok().body(new Response(false, ConstraintViolationExceptionHandler.getMessage(e)));
		} catch (Exception e) {
			return ResponseEntity.ok().body(new Response(false, e.getMessage()));
		}

		return ResponseEntity.ok().body(new Response(true, "处理成功", null));
	}

}
