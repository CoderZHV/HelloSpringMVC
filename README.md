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