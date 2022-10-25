package com.tccspringboot.tccspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tccspringboot.tccspringboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
} 
