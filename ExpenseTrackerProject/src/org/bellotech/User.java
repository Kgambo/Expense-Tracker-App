package org.bellotech;

import java.util.Scanner;

public class User {
	public String username;
	public String email;
	public String password;
	public String address;
	public int phoneNumb;

	public User() {

		this.username = username;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneNumb = phoneNumb;

	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumb() {
		return phoneNumb;
	}

	public void setPhoneNumb(int phoneNumb) {
		this.phoneNumb = phoneNumb;
	}

	public void loginCheck() {
		char ch;
		do {
			
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Input Login Details :");
			
			System.out.println("Enter username");
			String username = sc.nextLine();
			System.out.println("Enter password");
			String setPassword = sc.nextLine();
		
			if (username.equals(username) && setPassword.equals(password)) {
				System.out.println("Welcome User");
				break;
			} else {
				System.out.println("Access Denied");
			}
			System.out.println("Do you want to continue? " + "Y for yes/ N for no");

			ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'Y');

	}
}
