package com.victor.dojos.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.victor.dojos.models.Dojo;
import com.victor.dojos.services.DojoService;

@Controller
public class DojoController {
	
	@Autowired
	DojoService dojoService;
	
	
	@GetMapping("/dojo")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "index.jsp";
	}
	
	@PostMapping("/dojo/new")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo,
						BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		else {
		dojoService.createDojo(dojo);
		return "redirect:/dojo";
		}
	}
	
	@GetMapping("/dojo/{dojo_id}")
	public String showPerson(@PathVariable Long dojo_id, Model model) {
	    
	    Dojo someNinjas = dojoService.findDojo(dojo_id);
	    Dojo someDojos = dojoService.findDojo(dojo_id);
	    model.addAttribute("dojoName",someDojos);
	    model.addAttribute("dojos", someNinjas.getNinjas());
	    
	    return "show.jsp";
	}

}
