package co.yedam.board.service;

import java.util.List;

import co.yedam.board.vo.BoardVO;

public interface BoardService {
	List<BoardVO> boardList();
	boolean addBoard(BoardVO vo);
}
