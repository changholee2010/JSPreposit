package co.yedam.common;

import org.apache.ibatis.session.SqlSession;

import co.yedam.board.mapper.BoardMapper;
import co.yedam.board.vo.BoardVO;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);

		SqlSession session = DataSource.getInstance().openSession(true);
		BoardMapper mapper = session.getMapper(BoardMapper.class);

//		BoardVO vo = new BoardVO();
//		vo.setTitle("modify title");
//		vo.setContent("modify content");
//		vo.setWriter("updatee");
//		vo.setBoardNo(263);
//
//		// 데이터 변경.
//		mapper.updateBoard(vo);

		// 데이터 조회.
		mapper.boardList().forEach(board -> {
			System.out.println(board);
		});

	}
}
