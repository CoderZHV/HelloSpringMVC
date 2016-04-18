package com.springmvc.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
public class MainTest {
	
	private static final String SUCCESS="success";
	
	@RequestMapping(value="/requestmapping", method=RequestMethod.POST)
	public String requestMapping(){
		System.out.println("requestMapping");
		return SUCCESS;
	}
}
