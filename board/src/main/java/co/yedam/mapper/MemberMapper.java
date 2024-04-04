package co.yedam.mapper;

import java.util.List;

import co.yedam.vo.MemberVO;

public interface MemberMapper {
	public MemberVO selectMember(MemberVO mvo);
	public int insertMember(MemberVO mvo);
	public List<MemberVO> selectMembers();
	
	// 상품목록.
}
