package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class LoginController {
@RequestMapping("login")
public String loginform() {
	return "/login/login";
}

@RequestMapping("logindo")
public ModelAndView loginform(HttpServletRequest request) {
	System.out.println(request.getRequestURI());
	String [] arr = request.getRequestURI().split("/");
	String map = "/" + arr[1]+"/";
	String page = "loginsuccess";
	ModelAndView mv = new ModelAndView();
	
	request.getSession().setAttribute("id", "user");
	mv.setViewName(map + page);
	return mv;
}
}
