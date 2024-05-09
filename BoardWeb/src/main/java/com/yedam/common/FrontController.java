package com.yedam.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	private Map<String, Control> map = new HashMap<>();

	@Override
	public void init(ServletConfig config) throws ServletException {
		map.put("/first.do", new FirstControl());
		map.put("/second.do", new SecondControl());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String context = req.getContextPath();
		String path = uri.substring(context.length());

		System.out.println(path);
		Control ctrl = map.get(path);
		ctrl.exec(req, resp);

	}
}
