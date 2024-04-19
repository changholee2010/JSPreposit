package com.yedam.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;

public class CheckName implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");

		List<String> names = new ArrayList<>();
		names.add("홍길동");
		names.add("박길동");
		names.add("김길동");

		if (names.contains(name)) {
			resp.getWriter().println("{\"retCode\":\"Success\"}");
		} else {
			resp.getWriter().println("{\"retCode\":\"Fail\"}");
		}

	}

}
