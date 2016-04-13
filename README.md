# HelloSpringMVC

Hello SpringMVC

1.��web.xml�ļ�����DispatcherServlet
	<servlet>
		<servlet-name>springDispatcherServlet</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<!-- ���� DispatcherServlet��һ����ʼ������������SpringMvb�����ļ������Ƽ�λ��-->
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

2.����springmvc.xml�ļ����������Զ�ɨ��İ�
	<context:component-scan base-package="com.springmvc.hello"></context:component-scan>
	
3.����һ���࣬����@controller��ʶ������ӳ�䷽������@RequestMapping��ʶ

4����springmvc.xml��������ͼ������
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/views/"></property>
		<property name="suffix" value=".jsp"></property>
	</bean>
	
5.������ͼ