package com.itheima.b_request.f_param;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ȡ�������
 */
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡusername
		String username = request.getParameter("name");
		System.out.println("username:"+username);
		
		//��ȡ���ֵ
		String[] hobby = request.getParameterValues("hobby");
		System.out.println("hobby:"+Arrays.toString(hobby));
		
		//��ȡ����
		System.out.println("=========");
		Map<String, String[]> map = request.getParameterMap();
		for (String key : map.keySet()) {
			System.out.println(key+"::"+Arrays.toString(map.get(key)));
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
