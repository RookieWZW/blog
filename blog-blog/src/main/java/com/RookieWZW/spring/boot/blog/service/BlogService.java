package com.RookieWZW.spring.boot.blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.RookieWZW.spring.boot.blog.domain.Blog;
import com.RookieWZW.spring.boot.blog.domain.User;

/** 
* @author RookieWZW
* @version 创建时间：2018年8月6日 下午2:53:47 
* 类说明 
*/
public interface BlogService {
	
	Blog saveBlog(Blog blog);
	
	
	void removeBlog(Long id);
	
	
	Blog updateBlog(Blog blog);
	
	Blog getBlogById(Long id);
	
	
	Page<Blog> listBlogsByTitleLike(User user,String title,Pageable pageable);
	
	
	Page<Blog> listBlogsByTitleLikeAndSort(User user,String title,Pageable pageable);
	
	
	void readingIncrease(Long id);
	
}
 