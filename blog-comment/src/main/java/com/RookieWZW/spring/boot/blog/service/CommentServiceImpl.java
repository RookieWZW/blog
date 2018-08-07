package com.RookieWZW.spring.boot.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RookieWZW.spring.boot.blog.domain.Comment;
import com.RookieWZW.spring.boot.blog.repository.CommentRepository;

/** 
* @author RookieWZW
* @version 创建时间：2018年8月7日 上午10:46:39 
* 类说明 
*/
@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Transactional
	@Override
	public Comment getCommentById(Long id) {
		// TODO Auto-generated method stub
		return commentRepository.findOne(id);
	}
	
	@Override
	public void removeComment(Long id) {
		// TODO Auto-generated method stub
		commentRepository.delete(id);
	}

}
 