/*
 * CopyRight (c) 2012-2015 Hikvision Co, Ltd. All rights reserved. Filename:
 * SimpleController.java Creator: joe.zhao(zhaohaolin@hikvision.com.cn)
 * Create-Date: 下午4:53:00
 */
package com.hikvision.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO
 * 
 * @author joe.zhao(zhaohaolin@hikvision.com.cn)
 * @version $Id: SimpleController, v 0.1 2015年8月13日 下午4:53:00 Exp $
 */
@Controller
public class SimpleController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "hello world";
	}
	
}
