package com.RookieWZW.spring.boot.blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.RookieWZW.spring.boot.blog.domain.User;

/** 
* @author RookieWZW
* @version 创建时间：2018年8月6日 下午10:38:31 
* 类说明 
*/
public interface UserRepository extends JpaRepository<User, Long>{

	/**
	 * 根据用户名分页查询用户列表
	 * @param name
	 * @param pageable
	 * @return
	 */
	Page<User> findByNameLike(String name, Pageable pageable);
	
	User findByUsername(String username);
}
