/*
 * CopyRight (c) 2012-2015 Hikvision Co, Ltd. All rights reserved. Filename:
 * UserController.java Creator: joe.zhao(zhaohaolin@hikvision.com.cn)
 * Create-Date: 下午7:02:05
 */
package com.hikvision.boot.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hikvision.boot.demo.domain.User;

/**
 * TODO
 * 
 * @author joe.zhao(zhaohaolin@hikvision.com.cn)
 * @version $Id: UserController, v 0.1 2015年8月13日 下午7:02:05 Exp $
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/{id}")
	public User view(@PathVariable("id") Long id) {
		User user = new User();
		user.setId(id);
		user.setName("zhaohaolin");
		return user;
	}
	
}
