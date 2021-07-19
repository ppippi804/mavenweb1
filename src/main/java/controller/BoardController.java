package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import board.dao.BoardDAO;

@Controller
public class BoardController {
	@Autowired
	BoardDAO dao;
	
	@RequestMapping("/board/list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageboard", dao.list(1));
		mv.setViewName("/board/list");
		return mv;
	}
	
	@RequestMapping("/board/testform")
	public String testform() {
		return "/board/testform";
	}
	
	@RequestMapping(value = "/board/test", produces= "application/json; charset=utf8")
	@ResponseBody
	public String test(String p) {
		System.out.println("p : " + p);
		return p;
	}
	
	@RequestMapping("/board/searchList")
	public ModelAndView searchList(String field, String search, int requestPage) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageboard", dao.searchList(field, search, requestPage));
		mv.setViewName("/board/list");
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping("board/read")
//	public ModelAndView read(HttpServletRequest request) {
//		System.out.println(request.getParameter("idx"));
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("board", dao.select(Integer.parseInt(request.getParameter("idx"))));
//		mv.setViewName("board/read");
//		return mv;
//	}
//	
//	@RequestMapping("board/insert")
//	public ModelAndView insert() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("insert", dao.insert(vo));
//		mv.setViewName("board/writeForm");
//		return mv;
//	}
//	
//	@RequestMapping("board/insert.do")
//	public ModelAndView insertdo(HttpServletRequest request) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("insert", dao.insert(vo));
//		mv.setViewName("board/list");
//		return mv;
//	}
//	
//	@RequestMapping("board/read/update")
//	public ModelAndView update(HttpServletRequest request) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("board", dao.update(Integer.parseInt("idx"), request.getParameter("title"), request.getParameter("content")));
//		mv.setViewName("board/read/update");
//		return mv;
//	}
	
//	@RequestMapping("board/read/reply")
//	public ModelAndView reply(HttpServletRequest request) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("requestPage",(request.getParameter("requestPage"))); 
//		mv.addObject("idx", Integer.parseInt(request.getParameter("idx"))); 
//		mv.addObject("groupid",Integer.parseInt(request.getParameter("groupid")));
//		mv.addObject("depth",Integer.parseInt(request.getParameter("depth")));
//		mv.addObject("reOreder",Integer.parseInt(request.getParameter("reOrder")));
//		mv.addObject("title",request.getParameter("title"));
//		mv.addObject("content",request.getParameter("content"));
//		mv.setViewName("board/read/reply");
//		return mv;
//	}
	
//	@RequestMapping("board/read/replyForm")
//	public ModelAndView reply(HttpServletRequest request) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("board", dao.replyInsert(vo));
//		mv.setViewName("board/read/replyForm");
//		return mv;
//	}
	
	
}
