# HelloSpringMVC-����ģ�ʹ���

1.ModelAndView (com.springmvc.modelandview.TestModelAndView)

	String viewName="success";
	ModelAndView model = new ModelAndView(viewName);
	model.addObject("data", new Date());
	return model;