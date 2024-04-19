package com.yedam.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.BookService;
import com.yedam.service.BookServiceImpl;
import com.yedam.vo.BookVO;

public class BookAdd implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 도서등록후 retCode를 반환하도록 구현(json포맷) 성공일경우: Success, 실패일 경우 Fail.
		resp.setContentType("text/json;charset=utf-8");

		String bcode = req.getParameter("bookCode");
		String btitle = req.getParameter("bookTitle");
		String author = req.getParameter("author");
		String company = req.getParameter("company");
		String price = req.getParameter("price");

		BookVO bvo = new BookVO();
		bvo.setBookCode(bcode);
		bvo.setBookTitle(btitle);
		bvo.setAuthor(author);
		bvo.setCompany(company);
		bvo.setPrice(Integer.parseInt(price));

		System.out.println(bvo);

		BookService svc = new BookServiceImpl();
		if (svc.addBook(bvo)) {
			resp.getWriter().println("{\"retCode\":\"Success\"}");
		} else {
			resp.getWriter().println("{\"retCode\":\"Fail\"}");
		}

	}

}
