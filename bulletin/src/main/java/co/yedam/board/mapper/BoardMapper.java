package co.yedam.board.mapper;

import java.util.List;

import co.yedam.board.vo.BoardVO;

public interface BoardMapper {
	List<BoardVO> boardList();
	int insertBoard(BoardVO board);
	int updateBoard(BoardVO board);
}
