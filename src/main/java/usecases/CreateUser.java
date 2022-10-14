package usecases;

import model.User;

public class CreateUser {
	
	public static User call() {
		return new User("Berman", "LIPE");
	}
}
