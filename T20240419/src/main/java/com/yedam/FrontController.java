package com.yedam;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.web.BookAdd;
import com.yedam.web.BookInfo;
import com.yedam.web.BookList;
import com.yedam.web.BookRemove;
import com.yedam.web.CheckName;
import com.yedam.web.CheeringControl;
import com.yedam.web.MainControl;

public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	Map<String, Control> map;

	public FrontController() {
		map = new HashMap<>();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		map.put("/main.do", new MainControl());
		map.put("/cheering.do", new CheeringControl());
		map.put("/checkName.do", new CheckName());

		map.put("/bookInfo.do", new BookInfo());

		// json 포맷을 반환하도록 아래를 완성하세요.
		map.put("/bookListJson.do", new BookList());
		map.put("/bookAddJson.do", new BookAdd());
		map.put("/bookRemoveJson.do", new BookRemove());

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");

		resp.setContentType("text/html;charset=utf-8");

		String uri = req.getRequestURI();
		String context = req.getContextPath();
		String path = uri.substring(context.length());

		Control control = map.get(path);
		control.exec(req, resp);
	}
}
