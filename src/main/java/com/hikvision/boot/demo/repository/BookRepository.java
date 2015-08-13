/*
 * CopyRight (c) 2012-2015 Hikvision Co, Ltd. All rights reserved. Filename:
 * BookRepository.java Creator: joe.zhao(zhaohaolin@hikvision.com.cn)
 * Create-Date: 下午7:45:46
 */
package com.hikvision.boot.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hikvision.boot.demo.domain.Book;

/**
 * TODO
 * 
 * @author joe.zhao(zhaohaolin@hikvision.com.cn)
 * @version $Id: BookRepository, v 0.1 2015年8月13日 下午7:45:46 Exp $
 */
public interface BookRepository extends MongoRepository<Book, String> {
	
}
