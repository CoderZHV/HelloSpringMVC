# HelloSpringMVC

Hello SpringMVC

1.在web.xml文件配置DispatcherServlet
	<servlet>
		<servlet-name>springDispatcherServlet</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<!-- 配置 DispatcherServlet的一个初始化参数，配置SpringMvb配置文件的名称及位置-->
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>classpath:springmvc.xml</param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>
	
	<servlet-mapping>
		<servlet-name>springDispatcherServlet</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>

2.创建springmvc.xml文件，并配置自动扫描的包
	<context:component-scan base-package="com.springmvc.hello"></context:component-scan>
	
3.创建一个类，并用@controller标识，创建映射方法，用@RequestMapping标识

4，在springmvc.xml中配置视图解析器
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/views/"></property>
		<property name="suffix" value=".jsp"></property>
	</bean>
	
5.创建视图