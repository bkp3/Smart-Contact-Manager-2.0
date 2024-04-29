package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home page handler");
		
		//sending data to view
		model.addAttribute("name", "Bhola Kumar");
		model.addAttribute("edu", "btech");
		model.addAttribute("branch", "ece");
		model.addAttribute("github", "https://www.github.com");
		return "home";
	}

}
