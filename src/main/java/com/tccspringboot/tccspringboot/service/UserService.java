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
		return userRepository.save(user);
	}

	public User findById(Long id) {
		return userRepository.findById(id).get();
	}

	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	public User follow(Long userFollowed, Long userFollower) {

		User user =	findById(userFollowed);
		User userBeingFollower = findById(userFollower);
		user.getFollowers().add(userBeingFollower.getId());
		return update(user);
	}

	public List<Long> findFollowers(Long id) {
		User user = findById(id);

		return user.getFollowers();

	}


}
