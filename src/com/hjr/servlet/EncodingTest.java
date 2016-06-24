package com.hjr.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EncodingTest
 */
public class EncodingTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = this.getServletContext().getInitParameter("UserName");
		String passport = this.getServletConfig().getInitParameter("Password");
		response.setContentType("text/html;Charset=utf-8");
		response.getWriter().println(userName);
		response.getWriter().println(passport);
		response.getWriter().println("侯景瑞");
	}

}
