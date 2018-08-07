package com.RookieWZW.spring.boot.blog.service;

import com.RookieWZW.spring.boot.blog.domain.Comment;

/** 
* @author RookieWZW
* @version 创建时间：2018年8月7日 上午10:45:45 
* 类说明 
*/
public interface CommentService {
	
	
	Comment getCommentById(Long id);
	
	
	void removeComment(Long id);
}
 