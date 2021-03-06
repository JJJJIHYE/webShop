package com.kosta.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class loginFilter
 */
@WebFilter("/emp/*")
public class loginFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public loginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 세션에 저장된 멤버가 없다면 로그인안한것
		// 로그인없이 직원정보보기 불가.
		HttpServletRequest req = (HttpServletRequest)request; //형변환
		HttpServletResponse rep= (HttpServletResponse)response; //형변환
		
		
		HttpSession session=req.getSession();
		Object obj = session.getAttribute("member");
		if (obj == null) {
			System.out.println("세션에 저장된 멤버가 없다면 로그인안한것 .로그인없이 직원정보보기 불가");
			rep.sendRedirect("../pro09/memberlogin");
			return;
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
