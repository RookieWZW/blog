package com.RookieWZW.spring.boot.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.RookieWZW.spring.boot.blog.domain.Blog;
import com.RookieWZW.spring.boot.blog.domain.User;
import com.RookieWZW.spring.boot.blog.repository.BlogRepository;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月6日 下午2:56:26 类说明
 */
@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepository blogRepository;

	@Transactional
	@Override
	public Blog saveBlog(Blog blog) {
		// TODO Auto-generated method stub
		return blogRepository.save(blog);
	}

	@Transactional
	@Override
	public void removeBlog(Long id) {
		// TODO Auto-generated method stub
		blogRepository.delete(id);
	}

	@Transactional
	@Override
	public Blog updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		return blogRepository.save(blog);
	}

	@Override
	public Blog getBlogById(Long id) {
		// TODO Auto-generated method stub
		return blogRepository.findOne(id);
	}

	@Override
	public Page<Blog> listBlogsByTitleLike(User user, String title, Pageable pageable) {
		// TODO Auto-generated method stub
		title = "%" + title + "%";

		Page<Blog> blogs = blogRepository.findByUserAndTitleLikeOrderByCreateTimeDesc(user, title, pageable);

		return blogs;

	}

	@Override
	public Page<Blog> listBlogsByTitleLikeAndSort(User user, String title, Pageable pageable) {
		// TODO Auto-generated method stub
		title = "%" + title + "%";
		Page<Blog> blogs = blogRepository.findByUserAndTitleLike(user, title, pageable);

		return blogs;
	}

	@Override
	public void readingIncrease(Long id) {
		// TODO Auto-generated method stub
		Blog blog = blogRepository.findOne(id);
		blog.setReading(blog.getReading() + 1);
		blogRepository.save(blog);
	}

}
