package co.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.BoardService;
import co.yedam.service.BoardServiceImpl;
import co.yedam.vo.BoardVO;

public class AddBoard implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// title, content, writer 3개 파라미터.
		String tit = req.getParameter("title");
		String con = req.getParameter("content");
		String wri = req.getParameter("writer");

		BoardVO vo = new BoardVO();
		vo.setTitle(tit);
		vo.setContent(con);
		vo.setWriter(wri);

		BoardService svc = new BoardServiceImpl();
		if (svc.addBoard(vo)) {
			resp.sendRedirect("boardList.do");

		} else {
			req.setAttribute("msg", "등록중 에러가 발생.");
			req.getRequestDispatcher("WEB-INF/view/error.jsp").forward(req, resp);

		}
	}

}
