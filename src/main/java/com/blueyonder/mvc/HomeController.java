package com.blueyonder.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;


@Controller
public class HomeController {
	@GetMapping	("/")
	public String Details() {
		return "index";
	}
	
/*	@PostMapping("submit")
	public ModelAndView answer(@RequestParam("fname") String fname, @RequestParam("lname") String lname) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("answer.html");
		
		String fullname=fname+lname;
		mv.addObject("fullname",fullname);
		System.out.println("Fullname added");
	    return mv;
	}*/
//	
/*	@PostMapping("addAlien")
	public String answer(@RequestParam("aid") int aid, @RequestParam("name") String name, Model m) {
				
		alien a=new alien();
		a.setAid(aid);
		a.setName(name);
		
//		String fullname=fname+lname;
		m.addAttribute("fullname",a);
		System.out.println("Details added");
		return "answer";
	}*/
	
	@PostMapping("addAlien")
	public String answer(alien a, Model m) {
				
//		String fullname=fname+lname;
		m.addAttribute("fullname",a);
		System.out.println("Details added");
		return "answer";
	}



}
