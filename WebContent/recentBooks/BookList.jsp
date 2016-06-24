<%@page import="java.net.URLDecoder"%>
<%@page import="java.util.Map"%>
<%@page import="com.hjr.data.BookDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.hjr.domain.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookList</title>
</head>
<body>

	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th>书名</th>
			<th>价格</th>
			<th>出版社</th>
		</tr>
		<%
			Map<Integer, Book> books = BookDAO.getAll();
			for (Integer key : books.keySet()) {
				Book b = books.get(key);
				out.print("<tr><td><a href='book.jsp?id=" + b.getId() + "'>" + b.getName() + "</a></td><td>"
						+ b.getPrice() + "</td><td>" + b.getPublishing() + "</td></tr>");
			}
		%>
	</table>
	
	<%
		int flag = 0;
		String bookCookiePrefix = "Book_";
		Cookie[] cookies = request.getCookies();
		if(null !=cookies && cookies.length>0) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().startsWith(bookCookiePrefix)) {
					if(flag == 0) {
						out.print("<hr>您最近浏览的书： ");
						flag = 1;
					}
					out.println(URLDecoder.decode(cookie.getValue(),"UTF-8"));
				}
			}
		}
	%>

</body>
</html>