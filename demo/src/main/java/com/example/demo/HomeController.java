package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	@RequestMapping("/land")
	@ResponseBody
	public String land() {
		return "landing.jsp";
	}
	
}
