package model;

import java.io.Serializable;

import jakarta.persistence.Entity;

@Entity
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	
	String password;

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	

}
