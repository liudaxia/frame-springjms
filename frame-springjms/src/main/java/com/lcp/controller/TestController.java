package com.lcp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lcp.service.ProducerService;
import com.lcp.service.TestService;

@Controller
@RequestMapping(value="/test")
public class TestController {
	@Autowired
	private TestService testService;
	
	@Autowired
	private ProducerService producerService;
	
	@RequestMapping(value="/testName.do")
	public void testName(HttpServletRequest req,HttpServletResponse resp,String name){
		System.out.println("TestController testName params:"+name);
		String word=testService.TestName(name);
		System.out.println("TestController testName returns:"+word);
	};
	
	
	@RequestMapping(value="/testJms.do")
	public void testJms(HttpServletRequest req,HttpServletResponse resp,String msg){
		System.out.println("TestController testJms params:"+msg);
		producerService.sendMessage(msg);
	}
}
