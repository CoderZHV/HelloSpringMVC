# HelloSpringMVC

1.ModelAndView (com.springmvc.modelandview.TestModelAndView)

	String viewName="success";
	ModelAndView model = new ModelAndView(viewName);
	model.addObject("data", new Date());
	return model;
	
2.Map

3.SessionAttributes (com.springmvc.sessionattributes.TestSessionAttributes)

	*若希望在多个请求之间公用某个模型属性数据，则可以在“控制器类”上标注一个@SessionAttributes,SpringMVC将在模型中对应的属性暂存到HttpSession中
	*@SessionAttributes除了可以通过属性名指定需要放到会话中的属性外，还可以通过模型属性的对象类型指定哪些模型属性需要放到回话中
	注意：该注释只能放在类的上面。而不能修饰方法
	