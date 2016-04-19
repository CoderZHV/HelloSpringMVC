# HelloSpringMVC-数据模型处理

1.ModelAndView (com.springmvc.modelandview.TestModelAndView)

	String viewName="success";
	ModelAndView model = new ModelAndView(viewName);
	model.addObject("data", new Date());
	return model;