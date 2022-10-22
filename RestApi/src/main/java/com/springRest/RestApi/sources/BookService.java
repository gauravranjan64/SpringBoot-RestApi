package com.springRest.RestApi.sources;

import java.util.List;

import com.springRest.RestApi.entities.Books;

public interface BookService {
	public List<Books> getAllBooks();
	
	public Books getBookById(long bookId);
	
	public Books createBook(Books book);
	
	public Books updatBookById(Books book);
	
	public Books deleteBook(long bookId);
	
	public Books deleteAllBooks();
	
	public Books findByPublishedYear(String publishedYear);
	
}
