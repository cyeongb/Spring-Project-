package org.cyeon.test;

import javax.inject.Inject;

import org.cyeon.dao.BoardDAO;
import org.cyeon.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardDAOTest {
	
	@Inject
	private BoardDAO dao;
	
	private static Logger logger=LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Test
	public void testCreate()throws Exception{
		BoardVO board=new BoardVO();
		board.setTitle("글 제목");
		board.setContent("글 등록");
		board.setWriter("cyeon");
		dao.insert(board);
	}
	
	@Test
	public void testRead() throws Exception{
		logger.info(dao.read(2).toString());
	}
	
	@Test
	public void testUpdate() throws Exception{
		BoardVO board=new BoardVO();
		board.setBno(1);
		board.setTitle("수정 된 글 제목");
		board.setContent("수정  할 글");
		dao.update(board);
	}
	
	@Test
	public void testDelete() throws Exception{
		dao.delete(1);
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	

}
