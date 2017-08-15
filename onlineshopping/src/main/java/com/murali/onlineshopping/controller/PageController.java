package com.murali.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

		@RequestMapping(value={"/","/index","/home"})
		public ModelAndView index(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "Home");
			mv.addObject("userClickHome", true);
			return mv;
		}
		
		@RequestMapping("/about")
		public ModelAndView about(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "About Us");
			mv.addObject("userClickAbout", true);
			return mv;
		}
		
		@RequestMapping("/contact")
		public ModelAndView contact(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "Contact Us");
			mv.addObject("userClickContact", true);
			return mv;
		}
		
	/** Commented below is meant for practice and not part of the application*/
		
//		@RequestMapping(value="/test")
//		public ModelAndView test(@RequestParam(
//				value="greeting", required=false)String greeting){
//			if(greeting==null){
//				greeting = "Hello there!";
//			}
//			ModelAndView mv = new ModelAndView("page");
//			mv.addObject("greeting", greeting);
//			return mv;
//		}

//		@RequestMapping("/test/{greeting}")
//		public ModelAndView test(@PathVariable(
//				value="greeting", required=false) String greeting){
//			if(greeting == null){
//				greeting = "Hi there!";
//			}
//			ModelAndView mv = new ModelAndView("page");
//			mv.addObject("greeting", greeting);
//			return mv;
//		}
}
