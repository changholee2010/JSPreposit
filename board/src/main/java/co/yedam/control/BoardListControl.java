package co.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.BoardService;
import co.yedam.service.BoardServiceImpl;
import co.yedam.vo.BoardVO;

public class BoardListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// db정보 조회 후 -> boardList.jsp 출력.

		BoardService svc = new BoardServiceImpl();
		List<BoardVO> list = svc.boardList();

		req.setAttribute("blist", list);

		// 페이지재지정.
		req.getRequestDispatcher("WEB-INF/view/boardList.jsp")//
				.forward(req, resp);
	}

}
