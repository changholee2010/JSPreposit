package com.yedam;

import com.yedam.service.BookService;
import com.yedam.service.BookServiceImpl;
import com.yedam.vo.BookVO;

public class AppTest {
	public static void main(String[] args) {

		// 등록정보. BookVO를 정의하고 아래 주석을 해제 후 테스트하면 등록 및 목록이 되어야 합니다.
		BookVO bvo = new BookVO();
//		bvo.setBookCode("B011");
//		bvo.setAuthor("newbie");
//		bvo.setBookTitle("testing");
//		bvo.setCompany("print");
//		bvo.setPrice(20000);

		BookService svc = new BookServiceImpl();
		// 등록기능.
		if (svc.addBook(bvo)) {
			System.out.println("success");
		} else {
			System.out.println("fail");
		}
		// 목록기능.
		svc.blist().forEach(System.out::println);

	}
}
