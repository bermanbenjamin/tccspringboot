package com.tccspringboot.tccspringboot.delivery;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tccspringboot.tccspringboot.model.User;
import com.tccspringboot.tccspringboot.service.FollowsService;
import com.tccspringboot.tccspringboot.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private static UserService userService;
	
	private static FollowsService followsService;

	public UserController(UserService userService, FollowsService followsService) {
		UserController.userService = userService;
		UserController.followsService = followsService;
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
	public static ResponseEntity update(@RequestBody User user) {
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
	public static ResponseEntity findFollowers(@PathVariable Long id) {
		try {
			return ResponseEntity.ok(followsService.findFollowers(id));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@PutMapping(path = "/{id}/follow/{idUserToFollow}")
	public static ResponseEntity follow(@PathVariable  Long id, @PathVariable Long idUserToFollow) {
		try {
			return ResponseEntity.ok(followsService.follow(idUserToFollow, id));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	
}
