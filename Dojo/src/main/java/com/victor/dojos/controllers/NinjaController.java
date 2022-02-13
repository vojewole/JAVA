package com.victor.dojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.victor.dojos.models.Dojo;
import com.victor.dojos.models.Ninja;
import com.victor.dojos.services.DojoService;
import com.victor.dojos.services.NinjaService;

@Controller
public class NinjaController {

	@Autowired
	NinjaService ninjaService;
	
	@Autowired
	DojoService dojoService;
	
	@GetMapping("/ninja/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojoList", dojos);
		return "ninjaIndex.jsp";
	}
	
	@PostMapping("/ninja")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja,
						BindingResult result) {
		if(result.hasErrors()) {
			return "ninjaIndex.jsp";
		}
		else {
		ninjaService.createNinja(ninja);
		return "redirect:/ninja/new";
		}
	}
}
