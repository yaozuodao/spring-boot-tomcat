/*
 * CopyRight (c) 2012-2015 Hikvision Co, Ltd. All rights reserved. Filename:
 * Main.java Creator: joe.zhao(zhaohaolin@hikvision.com.cn) Create-Date:
 * 下午5:25:40
 */
package com.hikvision.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 * 
 * @author joe.zhao(zhaohaolin@hikvision.com.cn)
 * @version $Id: Main, v 0.1 2015年8月13日 下午5:25:40 Exp $
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
//@EnableScheduling
public class Main {
	
	public static void main(String[] args) {
		 SpringApplication.run(Main.class, args);
		
//		SpringApplication app = new SpringApplication(Main.class);
//		app.setWebEnvironment(true);
//		app.setShowBanner(false);
//		
//		Set<Object> set = new HashSet<Object>();
//		// set.add("classpath:spring/app-context.xml");
//		app.setSources(set);
//		app.run(args);
	}
	
}
