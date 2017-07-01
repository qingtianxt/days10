package com.itheima.b_request.f_param;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Param_Servlet
 */
public class Param_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		request.setCharacterEncoding("utf-8");
		
		//获取用户名和密码：
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	//	System.out.println(username+"::"+password);
		
		//username=new String(username.getBytes("iso8859-1"),"utf-8");
		
		System.out.println(username+"::"+password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
