/*
 * CopyRight (c) 2012-2015 Hikvision Co, Ltd. All rights reserved. Filename:
 * ScheduledTasks.java Creator: joe.zhao(zhaohaolin@hikvision.com.cn)
 * Create-Date: 下午8:36:24
 */
package com.hikvision.boot.demo.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * TODO
 * 
 * @author joe.zhao(zhaohaolin@hikvision.com.cn)
 * @version $Id: ScheduledTasks, v 0.1 2015年8月13日 下午8:36:24 Exp $
 */
@Component
public class ScheduledTasks {
	
	private final static SimpleDateFormat	DATEFORMAT	= new SimpleDateFormat(
																"HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("The time is now " + DATEFORMAT.format(new Date()));
	}
	
}
