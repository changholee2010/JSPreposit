package com.yedam.service;

import java.util.List;

import com.yedam.vo.BookVO;

public interface BookService {
	public String cheering();
	public List<BookVO> blist();
	public boolean addBook(BookVO bvo);
	public boolean removeBook(String bcode);
}
