package com.RookieWZW.spring.boot.blog.service;

import com.RookieWZW.spring.boot.blog.domain.Authority;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日 下午10:53:42 类说明
 */
public interface AuthorityService {

	Authority getAuthorityById(Long id);
}
