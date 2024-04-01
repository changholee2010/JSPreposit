package co.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.BoardService;
import co.yedam.service.BoardServiceImpl;
import co.yedam.vo.BoardVO;

public class ModifyBoardForm implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bno = req.getParameter("bno");

		BoardService svc = new BoardServiceImpl();
		BoardVO bvo = svc.getBoard(Integer.parseInt(bno));

		req.setAttribute("bvo", bvo);

		req.getRequestDispatcher("WEB-INF/view/modifyForm.jsp")//
				.forward(req, resp);

	}

}
