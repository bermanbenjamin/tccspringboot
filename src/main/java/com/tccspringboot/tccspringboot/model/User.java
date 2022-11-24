package com.tccspringboot.tccspringboot.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@Column(name = "userId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column  
	private String name;
	
	@Column  
	private String password;
	
	@Column
	private ArrayList<Long> followers;
	
	@Column  
	private Date birthdate;

	public User(){}

	public User(Long id, String name, String password, ArrayList<Long> followers,
			Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.followers = followers;
		this.birthdate = birthdate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Long> getFollowers() {
		return followers;
	}

	public void setFollowers(ArrayList<Long> followers) {
		this.followers = followers;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
	
}
