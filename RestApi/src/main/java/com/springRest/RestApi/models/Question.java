package com.springRest.RestApi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
//@Table(name = "tbl_Question")
//@EnableTransactionManagement
public class Question {
	
//	@Column(name="Question_id")
	@Id
	private int question_id;
	//@Column(name="Question_name")
	private String question_name;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int question_id, String question_name) {
		super();
		this.question_id = question_id;
		this.question_name = question_name;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion_name() {
		return question_name;
	}
	public void setQuestion_name(String question_name) {
		this.question_name = question_name;
	}
	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", question_name=" + question_name + "]";
	}
	
}
