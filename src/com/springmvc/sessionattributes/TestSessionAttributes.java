package com.springmvc.sessionattributes;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springmvc.domain.User;

@SessionAttributes(value={"user"},types={String.class})
@Controller
public class TestSessionAttributes {
	
	private static final String SUCCESS = "success";
	
	@RequestMapping("/testSessionAttributes")
	public String TestSA(Map<String, Object> map){
		User user = new User("jim", "123456", "jim@163.com", 12);
		map.put("user", user);
		map.put("school", "BBC");
		return SUCCESS;
	}
}
