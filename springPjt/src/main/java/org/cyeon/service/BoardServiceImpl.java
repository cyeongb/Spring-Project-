package org.cyeon.service;

import java.util.List;

import javax.inject.Inject;

import org.cyeon.dao.BoardDAO;
import org.cyeon.domain.BoardVO;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO dao;

	//====== 글 작성 ========
	@Override
	public void insert(BoardVO board) throws Exception {
		dao.insert(board);
		
	}

	//====== 글 읽기 =========
	@Override
	public BoardVO read(int bno) throws Exception {
		return dao.read(bno);
	}

	//====== 글 수정 =========
	@Override
	public void update(BoardVO board) throws Exception {
		dao.update(board);
		
	}

	//======= 글 삭제 ==========
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
		
	}

	// ========= 글 목록 =======
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}

}
