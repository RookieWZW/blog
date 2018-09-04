/**
 * 
 */
package com.RookieWZW.spring.boot.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RookieWZW.spring.boot.blog.domain.Authority;
import com.RookieWZW.spring.boot.blog.repository.AuthorityRepository;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日  类说明
 */
@Service
public class AuthorityServiceImpl  implements AuthorityService {
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.findOne(id);
	}

}
