package com.springRest.RestApi.Controller;
import com.springRest.RestApi.Repository.BookRepository;
import com.springRest.RestApi.models.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("book")
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping("all")
	public List<Book> getAllBooks() {
		
		List<Book> book=(List<Book>) bookRepository.findAll();
		return book;
	}
	
	@GetMapping("book/{id}")
	public Optional<Book> getBookById(@PathVariable int id){
		
		return bookRepository.findById(id);
	}
	
	@PostMapping("add")
	public Book createBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	@PutMapping("update")
	public Book updateBookById(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteBook(@PathVariable int id) {
		bookRepository.deleteById(id);
	}
	
	@DeleteMapping("deleteAll")
	public void deleteAllBooks() {
		bookRepository.deleteAll();
	}
	
//	public List<Book> findByPublishedYear(@PathVariable String publishedYear){
//		return bookRepository.findByPublishedYear(id);
//		
//	}

}
