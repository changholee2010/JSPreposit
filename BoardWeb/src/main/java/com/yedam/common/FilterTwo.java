package com.yedam.common;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/second.do")
public class FilterTwo extends HttpFilter implements Filter {

	public FilterTwo() {
		System.out.println("FilterTwo");
	}

	public void destroy() {
		System.out.println("destroy2");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter2 before");
		chain.doFilter(request, response);
		System.out.println("doFilter2 after");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init2");
	}

}
