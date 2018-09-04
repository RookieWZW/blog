package com.RookieWZW.spring.boot.blog.vo;

import java.io.Serializable;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日  类说明
 */
public class Menu implements Serializable{
 
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String url;
	
	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
