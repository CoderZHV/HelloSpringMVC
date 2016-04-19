package com.springmvc.modelandview;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestModelAadView {
	
	@RequestMapping("/testModelAadView")
	public ModelAndView modelAndView() {
		
		String viewName="success";
		ModelAndView model = new ModelAndView(viewName);
		model.addObject("data", new Date());

		return model;

	}

}
