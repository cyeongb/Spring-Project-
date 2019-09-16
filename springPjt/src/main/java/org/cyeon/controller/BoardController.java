package org.cyeon.controller;



import javax.inject.Inject;

import org.cyeon.domain.BoardVO;
import org.cyeon.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger logger=LoggerFactory.getLogger(BoardController.class);
	// ========== /board/ 로 오는 모든 요청을 처리하는 곳(자동으로 매핑이 된다.)
	//get 방식 : 외부나 다른사람에게 보낼 때, 조회가 가능하도록 만들어야 하는 것들.
	//post 방식: 사용자가 작업해야 하는 내용이 있을 때 사용, 본인이 어떤 작업을 진행하는 경우.
	
	//Model 클래스는 스프링에서 제공하는 '데이터 전달' 을 위한 객체이다.
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public void insertGet(BoardVO board,Model model)throws Exception{
		logger.info("insertGet ()");
		System.out.println("BoardController - insertGet()");
		
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insertPost(BoardVO board,RedirectAttributes redirect)throws Exception{
		logger.info("insertPost()");
		logger.info(board.toString());
		
		service.insert(board);
		
		//리다이렉트 할 때 한 번만 사용되는 데이터를 전송할 수 있다.전송 후 /board/list로 이동.
		redirect.addFlashAttribute("msg","success");
		
		return "redirect:/board/list";
		
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void list(Model model) throws Exception{		
		logger.info("list()");
		model.addAttribute("list",service.list());
	}
	
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public void read(@RequestParam("bno")int bno,Model model) throws Exception{		
		logger.info("read()");
		model.addAttribute(service.read(bno));
	}

}
