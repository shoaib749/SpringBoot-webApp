package com.unicon.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		
		ModelAndView mv = new ModelAndView();
		
		System.out.println("Hi " + alien);
		
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
		
	}

}
