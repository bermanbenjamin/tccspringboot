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
	private String id;
	
	@Column  
	private String name;
	
	@Column  
	private String password;
	
	@Column  
	private ArrayList<String> posts;
	
	@Column  
	private ArrayList<String> followers;
	
	@Column  
	private Date birthdate;

	public User(String id, String name, String password, ArrayList<String> posts, ArrayList<String> followers,
			Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.posts = posts;
		this.followers = followers;
		this.birthdate = birthdate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public ArrayList<String> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<String> posts) {
		this.posts = posts;
	}

	public ArrayList<String> getFollowers() {
		return followers;
	}

	public void setFollowers(ArrayList<String> followers) {
		this.followers = followers;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
	
}
