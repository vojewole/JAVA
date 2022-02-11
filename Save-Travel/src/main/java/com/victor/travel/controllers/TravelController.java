package com.victor.travel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.victor.travel.models.Expense;
import com.victor.travel.services.TravelService;

@Controller
public class TravelController {
	
	@Autowired
	TravelService travelService;
	
	@GetMapping("/expense")
	public String expenseList (Model model, @ModelAttribute("expense") Expense expense) {
		
		List<Expense> expenses = travelService.allExpenses();
		
		model.addAttribute("expenselist", expenses);
		return "index.jsp";
	}
	
	@PostMapping("/expense/add")
	public String create(@Valid @ModelAttribute("expense") Expense expense,
						BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = travelService.allExpenses();
			model.addAttribute("expenselist", expenses);
			return "index.jsp";
		}
		else {
		travelService.createExpense(expense);
		return "redirect:/expense";
		}
	}
	
	@GetMapping("/expense/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Expense expense = travelService.findExpense(id);
		model.addAttribute("expense", expense);
	    return "editTravel.jsp";
	}
	    
	@PutMapping("/expense/{id}")
	public String update(@Valid @ModelAttribute("expense") Expense expense, 
			BindingResult result) {
	        if (result.hasFieldErrors()) {
	            return "editTravel.jsp";
	        } else {
	            travelService.updateExpense(expense);
	            return "redirect:/expense";
	        }
	}
	
    @DeleteMapping("/expense/{id}")
    public String destroy(@PathVariable("id") Long id) {
        travelService.deleteExpense(id);
        return "redirect:/expense";
    }
    
    @GetMapping("/expense/{Id}")
	public String index (Model model, @PathVariable("Id") Long Id) 
	{
		Expense expense = travelService.findExpense(Id);
		model.addAttribute("expense", expense);
		return "show.jsp";
	}

}
