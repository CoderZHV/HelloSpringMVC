package com.springmvc.requestparam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestRequestParam {
	
	private static final String SUCCESS="success";
	
	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam(value="username") String username,
			@RequestParam(value="age",required=false) Integer age){
		System.out.println("testRequestParam usename:"+username+" age:"+age);
		return SUCCESS;
	}
	
}
