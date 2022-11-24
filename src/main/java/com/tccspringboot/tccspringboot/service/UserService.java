package com.tccspringboot.tccspringboot.service;

import com.tccspringboot.tccspringboot.model.User;
import com.tccspringboot.tccspringboot.repository.UserRepository;

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
			e.printStackTrace();
			throw new RuntimeException("Erro ao criar usuário: \n" + e.getMessage());
		}
	}

	public User findById(Long id) {
		try {
			return userRepository.findById(id).get();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao buscar usuário: \n" + e.getMessage());
		}
	}

	public void deleteById(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao deletar usuário: \n" + e.getMessage());
		}
	}

	public User update(User user) {
		try {
			return userRepository.save(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao atualizar usuário: \n" + e.getMessage());
		}
	}

	public Iterable<User> findAll() {
		try {
			return userRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao buscar todos os usuários: \n" + e.getMessage());
		}
	}

}
