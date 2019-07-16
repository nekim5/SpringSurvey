package org.sist.project.persistance;

import java.util.ArrayList;
import java.util.List;

import org.sist.project.domain.MemberVO;
import org.sist.project.domain.SearchVO;
import org.sist.project.domain.UpdateMemberVO;
import org.sist.project.member.MemberDetails;

public interface MemberDAO {
	public List<MemberVO> selectAdminList() throws Exception;
	public boolean insertMember(MemberVO member) throws Exception;
	public boolean deleteMember(int member_seq) throws Exception;
	public MemberDetails selectUserById(String username);
	public String selectUsername(String username);
	public List<MemberVO> selectSearchMember(SearchVO searchvo);
	public void updateMemberUnabled(UpdateMemberVO updatevo);
//	public void updateMemberUnabled2(ArrayList<Integer> member_seqList);
}
