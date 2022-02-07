package com.victor.book.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.victor.book.models.Book;
import com.victor.book.repositories.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    
    public Book updateBook(Long id, 
    					   String title, 
    					   String description, 
    					   String language, 
    					   Integer pages) 
    
    {	
    	Optional<Book> optionalBook= bookRepository.findById(id);
    	Book b = optionalBook.get();
    	b.setTitle(title);
    	b.setDescription(description);
    	b.setLanguage(language);
    	b.setNumberOfPages(pages);
    	return bookRepository.save(b);
    }
    
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}
