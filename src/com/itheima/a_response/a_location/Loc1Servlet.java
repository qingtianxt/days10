package com.itheima.a_response.a_location;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loc1Servlet
 */
public class Loc1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��˵��û��Ǯ~~");
		
		System.out.println("��Ի��û��Ǯ");
		
		//��ʽ1�����
		//����״̬�� 302
		//response.setStatus(302);
		
		//������Ӧͷ
	//	response.setHeader("location", "/days10/loc2");
		//��ʽ2������
		response.sendRedirect("/days10/loc2");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
