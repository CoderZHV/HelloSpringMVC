# HelloSpringMVC

1.RequestMapping的value，methmod,params及heads分别表示请求的url、请求方法、请求参数及请求头的映射条件。

	com.springmvc.requestmapping.MainTest.requestMapping
	
	@RequestMapping(params={"username","age!=10"})
	
2.Ant风格的映射路径。

	@RequestMapping("/request/*/abc") 请求url的*标记处可以为任意字符
	@RequestMapping("/request/**/abc")  /request/a/b/abc
	@RequestMapping("/request/abc?")	/request/abcd
	
3.PathVariable可以映射URL中的占位符到目标方法的参数中。

	com.springmvc.requestmapping.MainTest.testVariable
	
4.REST风格的请求（get、post、detete、put）
	
	先在web.xml中配置HiddenHttpMethodFilter
	<filter>
		<filter-name>hiddenHttpMethodFilter</filter-name>
		<filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>hiddenHttpMethodFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
	index.jsp中17到32行为前端发送请求的方法
	com.springmvc.rest.RestTest.java
	
5.RequestParam绑定请求参数(requestheader cookievalue)
	
	com.springmvc.requestparam.TestRequestParam

















	