package com.tccspringboot.tccspringboot.delivery;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tccspringboot.tccspringboot.model.User;
import com.tccspringboot.tccspringboot.service.UserService;

@RestController(value = "/users")
public class UserController {

	private static UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	
	@PostMapping(path = "/create")
	public static User createUser(@RequestBody User user) {
		return userService.create(user);
		
	}

	@GetMapping(path = "/{id}")
	public static User findById(@RequestBody Long id) {
		return userService.findById(id);
	}

	@DeleteMapping(path = "/{id}")
	public static void deleteById(@RequestBody Long id) {
		userService.deleteById(id);
	}

	@PutMapping(path = "/update")
	public static User update(@RequestBody User user) {
		return userService.update(user);
	}
//
//	@GetMapping(path = "/")
//	public static ArrayList<User> findAll() {
//		return (ArrayList<User>) userService.findAll();
//	}

	@GetMapping(path = "/{id}/followers")
	public static ArrayList<Long> findFollowers(@RequestBody Long id) {
		return (ArrayList<Long>) userService.findFollowers(id);
	}

	@GetMapping(path = "/{id}/follow/{idUserToFollow}")
	public static void follow(@RequestBody Long id, @RequestBody Long idUserToFollow) {
		userService.follow(id, idUserToFollow);
	}

	
}
