package co.yedam.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import co.yedam.common.DataSource;
import co.yedam.mapper.BoardMapper;
import co.yedam.vo.BoardVO;

public class AppTest {
	public static void main(String[] args) {
		SqlSessionFactory factory = DataSource.getInstance();
		SqlSession session = factory.openSession();

		BoardMapper mapper = session.getMapper(BoardMapper.class);

//		String result = session.selectOne("co.yedam.mapper.BoardMapper.getTimes");
		String result = mapper.getTimes();
		System.out.println(result);

		List<BoardVO> list = //
				// session.selectList("co.yedam.mapper.BoardMapper.selectList");
				mapper.selectList();

		list.forEach(board -> {
			System.out.println(board.toString());
		});

	}
}
