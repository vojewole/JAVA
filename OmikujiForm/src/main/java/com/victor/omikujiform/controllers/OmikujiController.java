package com.victor.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {

	@RequestMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/omikuji/send", method=RequestMethod.POST)
	public String sendOmikuji(HttpSession session, @RequestParam(value="numbers") Integer numbers,
							  @RequestParam(value="city") String city,
							  @RequestParam(value="person") String person,
							  @RequestParam(value="hobby") String hobby,
							  @RequestParam(value="thing") String thing,
							  @RequestParam(value="nice") String nice){
		session.setAttribute("numbers", numbers);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("nice", nice);
		
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("omikuji/show")
	public String showOmikuji(HttpSession session, Model model)
	{
		model.addAttribute("numbers", session.getAttribute("numbers"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("person", session.getAttribute("person"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("thing", session.getAttribute("thing"));
		model.addAttribute("show", session.getAttribute("show"));
		return "showOmikuji.jsp";
	}
	
}
