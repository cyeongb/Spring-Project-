package org.cyeon.dao;

import java.util.List;

import org.cyeon.domain.BoardVO;

public interface BoardDAO {
	
	public void insert(BoardVO vo) throws Exception;  //글 작성
	
	public BoardVO read(int bno) throws Exception;    //글 읽기
	
	public void update(BoardVO vo) throws Exception;   //글 수정
	
	public void delete(int bno) throws Exception;     //글 삭제
	
	public List<BoardVO> list() throws Exception;     //글 목록

}
