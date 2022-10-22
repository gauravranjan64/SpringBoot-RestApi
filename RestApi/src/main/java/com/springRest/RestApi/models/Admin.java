package com.springRest.RestApi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "tbl_Admin")
@EnableTransactionManagement
public class Admin {
	@Id
	@Column(name="UserName")
	private String username;
	
	@Column(name="Password")
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + "]";
	}
	
}
