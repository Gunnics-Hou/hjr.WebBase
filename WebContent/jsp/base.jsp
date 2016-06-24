<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BasicKnowledge</title>
</head>
<body>
	<%
		int a = 0;
	%>
	<%!int b = 0;%>
	<%
		a++;
	%>
	<%
		b++;
	%>

	<!--
	第二个标签表明生命了一个和Service同级别的类变量，
	JSP对象在内存中加载一次，
	所以每当该页面被访问一次，b的值会加1，而a得值一直是2
	  -->

	<%
		out.print("a=" + a);
	%>
	<%
		out.print("b=" + b);
	%>

</body>
</html>