package com.RookieWZW.spring.boot.blog.vo;

import java.io.Serializable;

/** 
* @author RookieWZW
* @version 创建时间：2018年8月17日 下午10:14:01 
* 类说明 
*/
public class TagVO implements Serializable{
	
	private static final Long serialVersionUID = 1L;
	
	private String name;
	private Long count;
	
	public TagVO(String name, Long count) {
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}
}
 