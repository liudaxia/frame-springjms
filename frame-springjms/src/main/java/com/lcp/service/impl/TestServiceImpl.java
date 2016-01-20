package com.lcp.service.impl;

import org.springframework.stereotype.Service;

import com.lcp.service.TestService;
@Service
public class TestServiceImpl implements TestService {

	public String TestName(String name) {
		System.out.println("TestServiceImpl TestName params:"+name);
		String word=name+":I'm coming";
		return word;
	}

}
