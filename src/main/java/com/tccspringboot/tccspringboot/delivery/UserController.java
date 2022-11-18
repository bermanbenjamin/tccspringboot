package com.tccspringboot.tccspringboot.delivery;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tccspringboot.tccspringboot.model.User;
import com.tccspringboot.tccspringboot.service.UserService;

@RestController(value = "/users")
public class UserController {

	private static UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}


	@PostMapping(path = "/create")
	public static ResponseEntity createUser(@RequestBody User user) {
		try {
			return ResponseEntity.ok(userService.create(user));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}

	@GetMapping(path = "/{id}")
	public static ResponseEntity findById(@PathVariable Long id) {
		try {
			return ResponseEntity.ok(userService.findById(id));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@DeleteMapping(path = "/{id}")
	public static ResponseEntity deleteById(@PathVariable Long id) {
		try {
			userService.deleteById(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PutMapping(path = "/update")
	public static ResponseEntity update(@PathVariable User user) {
		try {
			return ResponseEntity.ok(userService.update(user));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@GetMapping(path = "/all")
	public static ResponseEntity findAll() {
		try {
			return ResponseEntity.ok(userService.findAll());
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@GetMapping(path = "/{id}/followers")
	public static ResponseEntity findFollowers(@RequestBody Long id) {
		try {
			return ResponseEntity.ok(userService.findFollowers(id));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PutMapping(path = "/{id}/follow/{idUserToFollow}")
	public static ResponseEntity follow(@RequestBody Long id, @RequestBody Long idUserToFollow) {
		try {
			return ResponseEntity.ok(userService.follow(id, idUserToFollow));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	
}
