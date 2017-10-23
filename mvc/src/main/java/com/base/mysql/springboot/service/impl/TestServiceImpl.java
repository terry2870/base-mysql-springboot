/**
 * 
 */
package com.base.mysql.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.base.mysql.springboot.service.TestService;
/**
 * @author ping.huang
 * 2017年10月20日
 */
@Service
public class TestServiceImpl implements TestService {


	@Override
	public String test(String str) {
		return str;
	}

}
