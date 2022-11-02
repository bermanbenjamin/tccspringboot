package com.tccspringboot.tccspringboot.service;

import com.tccspringboot.tccspringboot.model.User;
import com.tccspringboot.tccspringboot.repository.UserRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User create(User user) {
		try {
			return userRepository.save(user);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao criar usuário");
		}
	}

	public User findById(Long id) {
		try {
			return userRepository.findById(id).get();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao buscar usuário");
		}
	}

	public void deleteById(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao deletar usuário");
		}
	}

	public User update(User user) {
		try {
			return userRepository.save(user);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao atualizar usuário");
		}
	}

	public Iterable<User> findAll() {
		try {
			return userRepository.findAll();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao buscar todos os usuários");
		}
	}

	public User follow(Long userFollowed, Long userFollower) {
	try {
		User userFollowedObj = findById(userFollowed);
		User userFollowerObj = findById(userFollower);
		userFollowedObj.getFollowers().add(userFollowerObj.getId());
		return update(userFollowedObj);
	} catch (Exception e) {
		throw new RuntimeException("Erro ao seguir usuário");
	}
	}

	public List<Long> findFollowers(Long id) {
		try {
			return findById(id).getFollowers();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao buscar seguidores");
		}

	}


}
