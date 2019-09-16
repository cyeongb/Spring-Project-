package org.cyeon.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.cyeon.domain.BoardVO;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.cyeon.mapper.BoardMapper";

	
	
	//====== 글 작성 ========
	@Override
	public void insert(BoardVO vo) throws Exception {
		session.insert(namespace+".insert",vo);
		
	}

	//====== 글 읽기 =========
	@Override
	public BoardVO read(int bno) throws Exception {
		return session.selectOne(namespace+".read",bno);
	}

	//====== 글 수정 =========
	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(namespace+".update",vo);
		
	}

	//======= 글 삭제 ==========
	@Override
	public void delete(int bno) throws Exception {
		session.delete(namespace+".delete",bno);
		
	}

	// ========= 글 목록 =======
	@Override
	public List<BoardVO> list() throws Exception {
		return session.selectList(namespace+".list");
	}

}
