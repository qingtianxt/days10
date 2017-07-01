package com.itheima.b_request.d_row;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����������
 */
public class RowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//��ȡ ����ʽ
		String m=request.getMethod();
		System.out.println("��ʽ��"+m);
		
		//��ȡ������Դ
		String uri=request.getRequestURI();
		String url=request.getRequestURL().toString();
		System.out.println("uri:"+uri);
		System.out.println("url:"+url);
		
		//��ȡ����������ַ���
		String s=request.getQueryString();
		System.out.println("get���������"+s);
		
		//��ȡЭ��汾
		String p=request.getProtocol();
		System.out.println("Э�飺"+p);
		
		System.out.println("-------��Ҫ��-------");
		
		//��ȡ�����ip
		String ip = request.getRemoteAddr();
		System.out.println("ip:"+ip);
		
		//��ȡ��Ŀ��
		String path = request.getContextPath();
		System.out.println("��Ŀ·����"+path);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
