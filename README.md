# HelloSpringMVC

1.ModelAndView (com.springmvc.modelandview.TestModelAndView)

	String viewName="success";
	ModelAndView model = new ModelAndView(viewName);
	model.addObject("data", new Date());
	return model;
	
2.Map

3.SessionAttributes

	*��ϣ���ڶ������֮�乫��ĳ��ģ���������ݣ�������ڡ��������ࡱ�ϱ�עһ��@SessionAttributes,SpringMVC����ģ���ж�Ӧ�������ݴ浽HttpSession��
	*@SessionAttributes���˿���ͨ��������ָ����Ҫ�ŵ��Ự�е������⣬������ͨ��ģ�����ԵĶ�������ָ����Щģ��������Ҫ�ŵ��ػ���
	<com.springmvc.sessionattributes.TestSessionAttributes>