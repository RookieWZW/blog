package com.RookieWZW.spring.boot.blog.service;

import com.RookieWZW.spring.boot.blog.domain.Comment;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日  类说明
 */
public interface CommentService {
	/**
	 * 根据id获取 Comment
	 * @param id
	 * @return
	 */
	Comment getCommentById(Long id);
	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	void removeComment(Long id);
}
