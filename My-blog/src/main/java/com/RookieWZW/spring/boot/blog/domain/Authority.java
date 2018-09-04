package com.RookieWZW.spring.boot.blog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

/** 
* @author RookieWZW
* @version 创建时间：2018年8月13日 上午11:11:00 
* 类说明 
*/
@Entity
public class Authority implements GrantedAuthority{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id // 主键
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长策略
	private Long id; // 用户的唯一标识

	@Column(nullable = false) // 映射为字段，值不能为空
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getAuthority() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
 