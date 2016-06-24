package com.hjr.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String LastLogingInTime = "last_login_time";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie timeCookie = new Cookie(LastLogingInTime, String.valueOf(System.currentTimeMillis()));
		Cookie[] cookies = request.getCookies();
		Cookie requestCookie = null;
		if (cookies != null && cookies.length > 0) {
			for (Cookie c : cookies) {
				if (LastLogingInTime.equals(c.getName())) {
					requestCookie = c;
				}
			}
		}
		response.setContentType("text/html;charset=utf-8");
		if (null == requestCookie) {
			response.getWriter().println("欢迎您，这是您第一次登陆！");
		} else {
			response.getWriter().println("欢迎您，您上次登陆的时间是：" + new Date(Long.parseLong(requestCookie.getValue())));
		}
		response.addCookie(timeCookie);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
