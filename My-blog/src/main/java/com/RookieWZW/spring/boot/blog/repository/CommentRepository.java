package com.RookieWZW.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RookieWZW.spring.boot.blog.domain.Comment;


public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
