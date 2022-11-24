package com.tccspringboot.tccspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "follows")
public class Follows {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
	private User idUser;
	
	@Column
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
	private User idFollowing;

	public Follows(){}

	public Follows(User idUser, User idFollowing) {
		super();
		this.idUser = idUser;
		this.idFollowing = idFollowing;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}

	public User getIdFollowing() {
		return idFollowing;
	}

	public void setIdFollowing(User idFollowing) {
		this.idFollowing = idFollowing;
	}

}

