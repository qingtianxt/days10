package com.itheima.a_response.b_body;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ������Ӧ��
 */
public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������Ӧ����������
		//response.setContentType("text/html;charset=utf-8");
		response.setHeader("content-type", "text/html;charset=utf-8");
		//ServletOutputStream os = response.getOutputStream();
		//�ֽ�������
		
		
		//��ӡ���
		//��ȡ�ַ���
		PrintWriter w = response.getWriter();
		
		w.println("<table border='1'><tr>");
		w.print("<td>�û�����</td>");
		w.println("<td>tom</td></tr>");
		w.print("<td>���룺</td>");
		w.println("<td>123</td></tr>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
