package org.bellotech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRegistration {

	private List<User> userList;

	public UserRegistration() {
		this.userList = new ArrayList<>();
	}

	public void userReg() {
		Scanner sc = new Scanner(System.in);
		System.out.println("REGISTRATION DETAILS");

		System.out.print("Enter username: ");
		String username = sc.nextLine();

		System.out.print("Enter password: ");
		String password = sc.nextLine();

		System.out.print("Enter email: ");
		String email = sc.nextLine();

		if (!isUsernameTaken(username)) {
			User newUser = new User(username, password, email);
			userList.add(newUser);
			System.out.println("User Registered Successfully");
		} else {
			System.out.println("Username already taken. Please use another username.");
		}
	}

	public void loginCheck() {
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Input Login Details:");
			System.out.println("Enter username:");
			String inputUsername = sc.nextLine();
			System.out.println("Enter password:");
			String inputPassword = sc.nextLine();

			if (isUserValid(inputUsername, inputPassword)) {
				System.out.println("Welcome User");
				break;
			} else {
				System.out.println("Access Denied");
			}

			System.out.println("Do you want to continue? (Y for yes/ N for no)");
			ch = sc.next().charAt(0);
			sc.nextLine(); // Consume the newline character left in the buffer

		} while (ch == 'Y' || ch == 'y');
	}

	private boolean isUsernameTaken(String username) {
		for (User user : userList) {
			if (user.getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}

	private boolean isUserValid(String username, String password) {
		for (User user : userList) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
}
