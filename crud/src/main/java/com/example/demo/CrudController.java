package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.Alienrepo;
@Controller
public class CrudController {
	
	@Autowired
	Alienrepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien){
		repo.save(alien);
		return "home";
	}
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid,Model model) {
		ModelAndView mv=new ModelAndView();
		Alien alien=repo.findById(aid).orElse(new Alien());
		
	    model.addAttribute(alien);
		System.out.println(alien);
		mv.setViewName("show");
		return mv;
	}
	@RequestMapping("/delAlien")
	public ModelAndView delAlien(@RequestParam int aid,Model model) {
		ModelAndView mv=new ModelAndView();
		repo.deleteById(aid);
		
	    
		mv.setViewName("home");
		return mv;
	}
}
