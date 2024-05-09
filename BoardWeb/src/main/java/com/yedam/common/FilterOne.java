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

@WebFilter("*.do")
public class FilterOne extends HttpFilter implements Filter {

	public FilterOne() {
		System.out.println("FilterOne");
	}

	public void destroy() {
		System.out.println("destroy1");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter1 before");
		chain.doFilter(request, response);
		System.out.println("doFilter1 after");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init1");
	}

}
