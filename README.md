# HelloSpringMVC

1.RequestMapping��value��methmod,params��heads�ֱ��ʾ�����url�����󷽷����������������ͷ��ӳ��������

	com.springmvc.requestmapping.MainTest.requestMapping
	
	@RequestMapping(params={"username","age!=10"})
	
2.Ant����ӳ��·����

	@RequestMapping("/request/*/abc") ����url��*��Ǵ�����Ϊ�����ַ�
	@RequestMapping("/request/**/abc")  /request/a/b/abc
	@RequestMapping("/request/abc?")	/request/abcd
	
3.PathVariable����ӳ��URL�е�ռλ����Ŀ�귽���Ĳ����С�

	com.springmvc.requestmapping.MainTest.testVariable
	
4.REST��������get��post��detete��put��
	
	����web.xml������HiddenHttpMethodFilter
	<filter>
		<filter-name>hiddenHttpMethodFilter</filter-name>
		<filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>hiddenHttpMethodFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
	index.jsp��17��32��Ϊǰ�˷�������ķ���
	com.springmvc.rest.RestTest.java
	
5.RequestParam���������(requestheader cookievalue)
	
	com.springmvc.requestparam.TestRequestParam

















	