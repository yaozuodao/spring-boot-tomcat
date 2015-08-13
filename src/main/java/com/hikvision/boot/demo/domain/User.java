/*
 * CopyRight (c) 2012-2015 Hikvision Co, Ltd. All rights reserved. Filename:
 * User.java Creator: joe.zhao(zhaohaolin@hikvision.com.cn) Create-Date:
 * 下午7:01:25
 */
package com.hikvision.boot.demo.domain;

/**
 * TODO
 * 
 * @author joe.zhao(zhaohaolin@hikvision.com.cn)
 * @version $Id: User, v 0.1 2015年8月13日 下午7:01:25 Exp $
 */
public class User {
	
	private Long	id;
	private String	name;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
