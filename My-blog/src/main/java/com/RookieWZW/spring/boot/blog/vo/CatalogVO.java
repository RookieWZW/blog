package com.RookieWZW.spring.boot.blog.vo;

import java.io.Serializable;

import com.RookieWZW.spring.boot.blog.domain.Catalog;

/** 
* @author RookieWZW
* @version 创建时间：2018年8月17日 下午10:18:06 
* 类说明 
*/
public class CatalogVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String username;
	
	private Catalog catalog;
	
	
	public CatalogVO() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
}
 