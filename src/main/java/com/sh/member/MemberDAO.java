package com.sh.member;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String NAMESPACE="MemberMapper." ;
	
	public int setWrite(MemberVO memberVO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setWrite", memberVO);
	}
}
