package com.telusko.Exp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/home")
	public ModelAndView welcome(@RequestParam("name") String myName, ModelAndView mv) {
		mv.addObject("name", myName);
		mv.setViewName("index");
		return mv;
	}

	// Getting Object by passing the instance variables in the url
	@RequestMapping("/aliens")
	public ModelAndView getAliens(@ModelAttribute("alien") Alien alien, ModelAndView mv) {
		System.out.println(alien.getSno() + " " + alien.getSname());
		mv.addObject("name", alien);
		mv.setViewName("index");
		return mv;
	}
}
