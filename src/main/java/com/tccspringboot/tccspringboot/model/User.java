package com.tccspringboot.tccspringboot.model;

import java.util.ArrayList;
import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String password;
	
	private ArrayList<Post> posts;
	
	private ArrayList<Long> followers;
	
	private Date birthdate;

	public User(Long id, String name, String password, ArrayList<Post> posts, ArrayList<Long> followers,
			Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.posts = posts;
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

	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
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
