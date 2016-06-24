<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hjr.data.BookDAO"%>
<%@page import="com.hjr.domain.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Information Page</title>
</head>
<body>

	<%
		String idStr = request.getParameter("id");
		Book book = null;
		try {
			book = BookDAO.findById(Integer.valueOf(idStr));
			out.println("<h2>" + book.getDescription() + "</h2><br>");

		} catch (NumberFormatException e) {
			out.println("您输入的参数有误！");
		}
		out.println("<a href='BookList.jsp'><h2>返回首页</h2></a>");
	%>

	<%
		Cookie[] cookies = request.getCookies();
		List<Cookie> bookCookies = new ArrayList<Cookie>();
		String bookCookiePrefix = "Book_";
		Cookie underAdding = new Cookie(bookCookiePrefix + book.getId(), 
				URLEncoder.encode(book.getName(),"UTF-8"));
		underAdding.setPath("/");

		if (null != cookies && cookies.length > 0) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().startsWith(bookCookiePrefix)) {
					if (cookie.getName().equals(underAdding.getName())) {
						cookie.setMaxAge(0);
					} else {
						bookCookies.add(cookie);
					}
				}
			}

			int bookNumber = bookCookies.size();
			System.out.println(bookNumber);
			if (bookNumber >= 5) {
				for (int index = bookNumber-1; index >= 4; index--) {
					bookCookies.get(index).setMaxAge(-1);
					System.out.println("我执行了");
				}
			}
			response.addCookie(underAdding);
		}
	%>

</body>
</html>