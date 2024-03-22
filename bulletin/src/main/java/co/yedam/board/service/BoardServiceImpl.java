package co.yedam.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.board.mapper.BoardMapper;
import co.yedam.board.vo.BoardVO;
import co.yedam.common.DataSource;

public class BoardServiceImpl implements BoardService {

	SqlSession session = DataSource.getInstance().openSession(true);
	BoardMapper mapper = session.getMapper(BoardMapper.class);

	@Override
	public List<BoardVO> boardList() {
		return mapper.boardList();
	}

	@Override
	public boolean addBoard(BoardVO vo) {
		return mapper.insertBoard(vo) == 1;
	}

}
