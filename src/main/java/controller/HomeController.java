package controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Data.Weather;

@Controller
public class HomeController{
	@Autowired
	Weather weather;
	// url - /aaa >> aaa.jsp파일을 요구하고 있음
	// url - /test >> test.jsp파일을 요구하고 있음
	//리턴값이 없는 함수를 맵핑할 경우 위의 사항이 적용됨
	//어노테이션 > 별도의 스프링 커트롤러 필요하지 않음
	//일반 자바파일 만들어 위에 @만 잘 붙여주면 됨
	//리턴값이 업을 경우 url이 jsp파일명을 의미한다.
	@RequestMapping("/test")
	void test() {
		System.out.println("test");
	}

	//맵핑설정
	@RequestMapping("/test1")
	ModelAndView test1() {
		System.out.println("test1");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "test1");
		mv.setViewName("test");
		return mv;
	}
	
	@RequestMapping("/test2")
	ModelAndView test2() {
		System.out.println("test2");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "test2");
		mv.setViewName("test");
		return mv;
	}
	
	@RequestMapping("/weather")
	ModelAndView weather() {
		//추가사항
//		ServletContext context = request.getServletContext();
//		context.setAttribute("context", "context");
//		HttpSession 
		
		
		
		ModelAndView mv = new ModelAndView();
//		mv.addObject("data", new Weather().getWeatherDate());
		mv.addObject("data", weather.getWeatherDate());
		mv.setViewName("weather");
		return mv;
	}
}	
