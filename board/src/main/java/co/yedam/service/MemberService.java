package co.yedam.service;

import java.util.List;

import co.yedam.vo.MemberVO;

public interface MemberService {
	public MemberVO loginCheck(MemberVO mvo);
	public boolean addMember(MemberVO mvo);
	public List<MemberVO> memberList();
}
