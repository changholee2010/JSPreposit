package com.yedam.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.common.Control;
import com.yedam.service.BookService;
import com.yedam.service.BookServiceImpl;
import com.yedam.vo.BookVO;

public class BookList implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 도서목록정보를 반환하도록 구현(json포맷)
		resp.setContentType("text/json;charset=utf-8");

		BookService svc = new BookServiceImpl();
		List<BookVO> list = svc.blist();

		Gson gson = new GsonBuilder().create();
		resp.getWriter().print(gson.toJson(list));

	}

}
