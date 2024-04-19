package com.yedam.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.common.Control;
import com.yedam.service.BookService;
import com.yedam.service.BookServiceImpl;

public class CheeringControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/json;charset=utf-8");

		BookService svc = new BookServiceImpl();
		String message = svc.cheering();

		Map<String, Object> msg = new HashMap<>();
		msg.put("msg", message);

		Gson gson = new GsonBuilder().create();
		resp.getWriter().println(gson.toJson(msg));
	}

}
