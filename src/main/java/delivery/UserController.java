package delivery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import model.User;

@Controller(value = "/users")
public class UserController {
	
	@PostMapping(path = "/create")
	public static User createUser() {
		return null;
		
	}
	
	@GetMapping(path = "/{id}")
	public static User getUser() {
		return null;
		
	}
	
	@PostMapping(path = "/update/{id}")
	public static User updateUser() {
		return null;
		
	}
	
	@DeleteMapping(path = "/delete")
	public static Boolean deleteUser() {
		return true;
		
	}
	
}
