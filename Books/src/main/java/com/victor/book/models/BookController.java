package com.victor.book.models;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.victor.book.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books/{bookId}")
	public String index (Model model, @PathVariable("bookId") Long bookId) 
	{
		Book book = bookService.findBook(bookId);
		model.addAttribute("books", book);
		return "show.jsp";
	}
	
	@RequestMapping("/books")
	public String bookList (Model model) {
		
		List<Book> books = bookService.allBooks();
		model.addAttribute("booklist", books);
		return "index.jsp";
	}
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "new.jsp";
	}
	
	@PostMapping("/books")
	public String create(@Valid @ModelAttribute("book") Book book,
						BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		else {
		bookService.createBook(book);
		return "redirect:/books";
		}
	}
	
	
}
