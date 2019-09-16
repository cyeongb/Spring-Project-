package org.cyeon.service;

import java.util.List;

import org.cyeon.domain.BoardVO;

public interface BoardService {
	
	// ========== service는 컨트롤러와 dao사이 다리역할이다.
	// 요구마다 다른 부분을 처리할 수 있다.(유연하다)
	// 디비와 무관하게 처리할 수 있다.
	// 컨트롤러의 일을 분업 처리 해 준다.
	// ============================================
	
	public void insert(BoardVO board) throws Exception;   //글 작성
	
	public BoardVO read(int bno) throws Exception;        //글 읽기
	
	public void update(BoardVO board) throws Exception;    //글 수정
	
	public void delete(int bno) throws Exception;          //글 삭제
	
	public List<BoardVO> list() throws Exception;          //글 목록

}
