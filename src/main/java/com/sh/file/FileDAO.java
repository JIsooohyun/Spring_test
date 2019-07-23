package com.sh.file;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class FileDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String NAMESPACE = "MemberFileMapper.";
	
	public int getWrite(FileVO fileVO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setWrite", fileVO);
	}
	
}
