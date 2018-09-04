package com.RookieWZW.spring.boot.blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.RookieWZW.spring.boot.blog.domain.Blog;
import com.RookieWZW.spring.boot.blog.domain.User;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日  类说明
 */
public interface BlogRepository extends JpaRepository<Blog, Long>{
	
	Page<Blog> findByUserAndTitleLikeOrderByCreateTimeDesc(User user, String title, Pageable pageable);
	
	
	Page<Blog> findByUserAndTitleLike(User user, String title, Pageable pageable);
}
