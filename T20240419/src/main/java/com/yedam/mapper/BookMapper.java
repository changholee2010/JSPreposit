package com.yedam.mapper;

import java.util.List;

import com.yedam.vo.BookVO;

public interface BookMapper {
	public String cheering();
	public List<BookVO> bookList();
	public int insertBook(BookVO bvo);
	public int deleteBook(String bcode);
}
