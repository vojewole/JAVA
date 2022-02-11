package com.victor.travel.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.victor.travel.models.Expense;
import com.victor.travel.repositories.TravelRepository;


	@Service
	public class TravelService {

		private final TravelRepository travelRepository;
	    
	    public TravelService(TravelRepository travelRepository) {
	        this.travelRepository = travelRepository;
	    }
	    // returns all the Expenses
	    public List<Expense> allExpenses() {
	        return travelRepository.findAll();
	    }
	    // creates a expense
	    public Expense createExpense(Expense e) {
	        return travelRepository.save(e);
	    }
	    // retrieves a expense
	    public Expense findExpense(Long id) {
	        Optional<Expense> optionalExpense = travelRepository.findById(id);
	        if(optionalExpense.isPresent()) {
	            return optionalExpense.get();
	        } else {
	            return null;
	        }
	    }
	    
	    
	    public Expense updateExpense(Expense e
	    					   ) 
	    
	    {	
	    	//Optional<Expense> optionalExpense = travelRepository.findById(id);
	    	//Expense e = optionalExpense.get();
	    	//e.setId(id);
	    	//e.setExpenseVar(expenseVar);
	    	//e.setVendor(vendor);
	    	//e.setAmount(amount);
	    	//e.setDescription(description);
	    	return travelRepository.save(e);
	    }
	    
	    public void deleteExpense(Long id) {
	    	travelRepository.deleteById(id);
	    }
	}

