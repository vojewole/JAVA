package com.victor.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.bookclub.models.Book;
import com.victor.bookclub.models.User;
import com.victor.bookclub.repositories.BookRepository;




@Service
public class BookService {

	private final BookRepository bookRepository;
	
	@Autowired
    UserService userService;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the Books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a Book
    public Book createBook(Long userId, Book b) {
    	User user = this.userService.findUser(userId);
    	if ( user == null ) return null;
		
		b.setUser(user);
		
		return bookRepository.save(b);
        //return bookRepository.save(b);
    }
    // retrieves a Book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    
    public Book updateBook(Book b) 
    
    {
    	return bookRepository.save(b);
    }
    
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}


