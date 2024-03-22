package co.yedam.board.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.board.service.BoardService;
import co.yedam.board.service.BoardServiceImpl;
import co.yedam.board.vo.BoardVO;

@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");

		BoardService svc = new BoardServiceImpl();
		List<BoardVO> list = svc.boardList();

		PrintWriter out = response.getWriter();
		out.println("<ul>");
		for (BoardVO vo : list) {
			out.println("<li>" + vo.getBoardNo() + "</li>");
		}
		out.println("</ul>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");

		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");

		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);

		BoardService svc = new BoardServiceImpl();
		if (svc.addBoard(vo)) {
			response.getWriter().println("<script>alert('OK')</script>");
		} else {
			response.getWriter().println("<script>alert('NG')</script>");
		}

	}

}
