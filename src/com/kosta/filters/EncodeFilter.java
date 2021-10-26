package com.kosta.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class EncodeFilter
 */
@WebFilter("/*")
public class EncodeFilter implements Filter {

    public EncodeFilter() {
        System.out.println("EncodeFilter ������");
    }
	public void destroy() {
		  System.out.println("EncodeFilter destroy");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// ��û������
		long start = System.currentTimeMillis();
		System.out.println("��û������");
		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);  //��û�� ����, ���� �ǵ�� �ȵ�!!!
		// �����ϱ���
		long end = System.currentTimeMillis();
		System.out.println("���䰡����:��ûó���ҿ�ð���"+(end-start));
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}