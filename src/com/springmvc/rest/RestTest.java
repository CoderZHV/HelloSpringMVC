package com.springmvc.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestTest {
	
	private static final String SUCCESS="success";
	
	@RequestMapping("/testRestGet/{id}")
	public String  restGet(@PathVariable("id") Integer id){
		System.out.println("REST GET" + id);
		return SUCCESS;
	}
	
	@RequestMapping("/testRestPost")
	public String  restPost(){
		System.out.println("REST POST");
		return SUCCESS;
	}
	
	@RequestMapping("/testRestPut/{id}")
	public String  restPut(@PathVariable("id") Integer id){
		System.out.println("REST Put"+id);
		return SUCCESS;
	}
	
	@RequestMapping("/testRestDelete/{id}")
	public String  restDelete(@PathVariable("id") Integer id){
		System.out.println("REST DETELE"+id);
		return SUCCESS;
	}
	
}
