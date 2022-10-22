package com.springRest.RestApi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "tbl_book")
@EnableTransactionManagement
public class Book {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Book_id")
	private int id;
	
	@Column(name="Book_title")
	private String title;
	
	@Column(name="Book_description")
	private String description;
	
	@Column(name="Book_publishedYear")
	private String publishedYear;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String title, String description, String publishedYear) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.publishedYear = publishedYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", publishedYear="
				+ publishedYear + "]";
	}
	

}
