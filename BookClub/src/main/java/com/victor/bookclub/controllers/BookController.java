package com.victor.bookclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.victor.bookclub.models.Book;
import com.victor.bookclub.models.User;

import com.victor.bookclub.services.BookService;
import com.victor.bookclub.services.UserService;

import java.util.List;

import javax.servlet.http.HttpSession;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class BookController {
	
	@Autowired
	BookService bookServices;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/books")
	public String showBooks( Model model, HttpSession session) {
		
		User user = userService.findUser((Long)session.getAttribute("userId"));
		model.addAttribute("user", user);
		List <Book> books = bookServices.allBooks();
	    model.addAttribute("books", books);
		return "books.jsp";
	}
	
	@GetMapping("/books/new")
	public String addBooks(@ModelAttribute("book") Book book) {
		return "addBook.jsp";
	}
	
	@PostMapping("/books/add")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session
						) {
		if(result.hasErrors()) {
			return "addBook.jsp";
		}
		else {
		Long bookId = (Long)session.getAttribute("userId");
		bookServices.createBook(bookId, book);
		return "redirect:/books";
		}
	}
	
	@GetMapping("/books/{booksId}")
	public String showBooks(@PathVariable Long booksId, Model model) {
		Book book = bookServices.findBook(booksId);
		model.addAttribute("books", book);
		return "show.jsp";
	}

}
