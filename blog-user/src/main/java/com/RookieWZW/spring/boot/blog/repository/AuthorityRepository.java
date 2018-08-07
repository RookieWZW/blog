package com.RookieWZW.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RookieWZW.spring.boot.blog.domain.Authority;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日 下午5:11:12 
 * 类说明
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

}
