package com.springmvc.sessionattributes;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.domain.User;

@Controller
public class TestModelAttribute {
	
	private static final String SUCCESS = "success";
	
	@ModelAttribute
	public void getUser(Map<String ,Object> map){
		User user = new User("jim", "123456", "jim@163.com", 13);
		System.out.println("ÐÞ¸Ä£º"+user);
		map.put("user", user);
	}
	
	@RequestMapping("/testModelAttribute")
	public String testMAB(User user){
		System.out.println("ÐÞ¸Ä£º"+user);
		return SUCCESS;
	}
}
