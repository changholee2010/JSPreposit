package com.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.DataSource;
import com.yedam.mapper.BookMapper;
import com.yedam.vo.BookVO;

public class BookServiceImpl implements BookService {
	SqlSession session = DataSource.getInstance().openSession(true);
	BookMapper mapper = session.getMapper(BookMapper.class);

	@Override
	public String cheering() {
		return mapper.cheering();
	}

	@Override
	public List<BookVO> blist() {
		// TODO Auto-generated method stub
		return mapper.bookList();
	}

	@Override
	public boolean addBook(BookVO bvo) {
		// TODO Auto-generated method stub
		return mapper.insertBook(bvo) == 1;
	}

	@Override
	public boolean removeBook(String bcode) {
		// TODO Auto-generated method stub
		return mapper.deleteBook(bcode) == 1;
	}

}
