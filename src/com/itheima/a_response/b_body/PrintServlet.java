package com.itheima.a_response.b_body;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 操作响应体
 */
public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理响应的中文乱码
		//response.setContentType("text/html;charset=utf-8");
		response.setHeader("content-type", "text/html;charset=utf-8");
		//ServletOutputStream os = response.getOutputStream();
		//字节流互斥
		
		
		//打印表格
		//获取字符流
		PrintWriter w = response.getWriter();
		
		w.println("<table border='1'><tr>");
		w.print("<td>用户名：</td>");
		w.println("<td>tom</td></tr>");
		w.print("<td>密码：</td>");
		w.println("<td>123</td></tr>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
