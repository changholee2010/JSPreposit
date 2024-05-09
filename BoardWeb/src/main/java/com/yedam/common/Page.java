package com.yedam.common;

import lombok.Data;

@Data
public class Page {
	private int start;
	private int end;
	private boolean prev, next;
	private int page;

	public Page(int page) {
		this.page = page;
		this.end = (int) Math.ceil(page / 5.0) * 5;
		this.start = this.end - 4;
		this.prev = this.start > 1;
		this.next = true;
	}
}
