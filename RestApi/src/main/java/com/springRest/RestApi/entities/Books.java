package com.springRest.RestApi.entities;

public class Books {
	private int id;
	private String title;
	private String description;
	private String publishedYear;
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(int id, String title, String description, String publishedYear) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.publishedYear = publishedYear;
	}
	public long getId() {
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
		return "Books [id=" + id + ", title=" + title + ", description=" + description + ", publishedYear="
				+ publishedYear + "]";
	}
	

}
