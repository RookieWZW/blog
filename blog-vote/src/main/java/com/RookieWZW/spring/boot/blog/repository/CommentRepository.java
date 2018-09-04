package com.RookieWZW.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RookieWZW.spring.boot.blog.domain.Comment;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日  类说明
 */
public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
