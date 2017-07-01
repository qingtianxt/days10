package com.itheima.b_request.e_header;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��������ͷ
 */
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ������ں�
		String agent = request.getHeader("user-agent");
		System.out.println(agent);
		
		//��ȡreferer
		String referer = request.getHeader("referer");
		if(referer==null){
			System.out.println("ֱ���ڵ�ַ���������");
		}
		else if(referer.contains("localhost")){
			System.out.println("���Լ����");
		}
		else if(referer.contains("192.168.")){
			System.out.println("���ǽ��ǵ��");
		}
		else{
			System.out.println("�����߿ɳ�");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
