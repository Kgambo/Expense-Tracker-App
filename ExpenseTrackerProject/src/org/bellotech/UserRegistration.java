package org.bellotech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRegistration extends User{

	private List<User> userList;

	public UserRegistration() {

		this.userList = new ArrayList<>();
	}

	public void userReg() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("REGISTRATION DETAILS"  );
		
		System.out.print("Enter username: ");
		String username = sc.nextLine();

		System.out.print("Enter password: ");
		String password = sc.nextLine();

		System.out.print("Enter email: ");
		String email = sc.nextLine();


		if (!isUsernameTaken(username)) {
			User newUser = new User();
			userList.add(newUser);
			System.out.println("User Registered Successfully");
			

		} else
			System.out.println("username Already taken please use another username");

	}

	private boolean isUsernameTaken(String username) {
		for (User user : userList) {
			if (user.getUsername().equals(username)) {
				return true;
			}
		}
		return false;

	}

}
