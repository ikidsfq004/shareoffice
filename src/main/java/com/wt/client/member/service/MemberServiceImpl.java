package com.wt.client.member.service;


<<<<<<< HEAD

import java.util.List;

import javax.servlet.http.HttpSession;

=======
>>>>>>> e01f1ba7acd5331861412e59ce7a1c5df6833aa4
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wt.client.member.dao.MemberDAO;
import com.wt.client.member.vo.MemberVO;
<<<<<<< HEAD
import com.wt.client.reservation.vo.ReservationVO;
=======
>>>>>>> e01f1ba7acd5331861412e59ce7a1c5df6833aa4

@Service
@Transactional
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO dao;

	@Override
	public void join(MemberVO vo) throws Exception {
		dao.join(vo);

	}
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		return dao.login(vo);

	}
<<<<<<< HEAD
	
	@Override
	public void logout(HttpSession session) throws Exception{
		dao.logout(session);

	}
	
	// 회원탈퇴
=======
>>>>>>> e01f1ba7acd5331861412e59ce7a1c5df6833aa4
	@Override
	public void memberDelete(MemberVO vo) throws Exception {
		dao.memberDelete(vo);

	}
	
	// 아이디 중복 체크
	@Override
	public int idChk(MemberVO vo) throws Exception {
		int result = dao.idChk(vo);
		return result;
	}

<<<<<<< HEAD
	// 비밀번호 중복 체크
=======
	// 아이디 중복 체크
>>>>>>> e01f1ba7acd5331861412e59ce7a1c5df6833aa4
	@Override
	public int pwChk(MemberVO vo) throws Exception {
		int result = dao.pwChk(vo);
		return result;
	}
<<<<<<< HEAD
	@Override
	public MemberVO logout(MemberVO vo) throws Exception {
		return null;
	}
	@Override
	public String serchId(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String serchPw(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ReservationVO> memberReserve(String c_id) {
		List<ReservationVO> rvo = dao.memberReserve(c_id);
		return rvo;
	}
	@Override
	public List<ReservationVO> memberUse(String c_id) {
		List<ReservationVO> rvo = dao.memberUse(c_id);
		return rvo;
	}
	@Override
	public List<ReservationVO> memberDone(String c_id) {
		List<ReservationVO> rvo = dao.memberDone(c_id);
		return rvo;
	}
	@Override
	public MemberVO memberListPwd(MemberVO mvo) {
		MemberVO g_mvo = dao.memberListPwd(mvo);
		return g_mvo;
	}
	
	
	  @Override 
	  public int modifySuccess(MemberVO vo) { 
		  
		  return dao.modifySuccess(vo);
	  }
	  
	  @Override 
	  public void memberModify(MemberVO vo) throws Exception {
	  dao.memberModify(vo);
	  
	  }
	  
	  @Override 
	  public void memberModifyPwChk(String k) throws Exception {
	  dao.memberModifyPwChk(k);
	  }
	  
	  
	 
	
=======
>>>>>>> e01f1ba7acd5331861412e59ce7a1c5df6833aa4
}
