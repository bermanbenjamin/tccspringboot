package com.tccspringboot.tccspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tccspringboot.tccspringboot.model.Follows;

@Repository
public interface FollowsRepository extends JpaRepository<Follows, Long> {
	
} 