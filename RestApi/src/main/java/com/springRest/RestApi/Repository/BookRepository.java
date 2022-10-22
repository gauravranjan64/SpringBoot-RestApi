package com.springRest.RestApi.Repository;
import com.springRest.RestApi.models.Book;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface BookRepository extends CrudRepository<Book, Integer>{
	public List<Book> findByPublishedYear(int id);

}
