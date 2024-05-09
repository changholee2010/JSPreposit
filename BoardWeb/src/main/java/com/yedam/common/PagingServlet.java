package com.yedam.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PagingServlet")
public class PagingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PagingServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String p = request.getParameter("p");

		Page page = new Page(Integer.parseInt(p));
		request.setAttribute("paging", page);

		request.getRequestDispatcher("WEB-INF/pageList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
