package com.RookieWZW.spring.boot.blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.RookieWZW.spring.boot.blog.domain.User;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日 下午5:07:30 类说明
 */
public interface UserRepository extends JpaRepository<User, Long> {

	Page<User> findByNameLike(String name, Pageable pageable);

	User findByUsername(String username);

}
