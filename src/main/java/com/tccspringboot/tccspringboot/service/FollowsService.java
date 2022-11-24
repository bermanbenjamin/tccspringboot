package com.tccspringboot.tccspringboot.service;

import com.tccspringboot.tccspringboot.model.Follows;
import com.tccspringboot.tccspringboot.repository.FollowsRepository;
import com.tccspringboot.tccspringboot.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FollowsService {

	private FollowsRepository followsRepository;
	
	private UserRepository userRepository;

	public FollowsService(FollowsRepository followsRepository) {
		this.followsRepository = followsRepository;
	}

	public Follows follow(Long userFollowed, Long userFollowing) {
		try {
			Follows follow = new Follows();
			follow.setIdFollowing(userRepository.findById(userFollowing).get());
			follow.setIdUser(userRepository.findById(userFollowed).get());
			return followsRepository.save(follow);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao seguir usuário: \n" + e.getMessage());
		}
	}

	public void unfollow(Long id) {
		try {
			followsRepository.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao deixar de seguir usuário: \n" + e.getMessage());
		}
	}

	public List<Follows> findFollowers(Long idUser) {
		try {
			ArrayList<Long> ids = new ArrayList<Long>();
			ids.add(idUser);
			return followsRepository.findAllById(ids);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao buscar seguidores: \n" + e.getMessage());
		}

	}


}
