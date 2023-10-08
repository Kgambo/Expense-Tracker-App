package org.bellotech;

import java.util.Scanner;

public class User {
	public String username;
	public String email;
	public String password;
	public String address;
	public int phoneNumb;

	public User(String username, String password, String email) {

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
	
	

	
	public String showInfo() {
		return "User [username=" + username + ", email=" + email + ", password=" + password + ", address=" + address
				+ ", phoneNumb=" + phoneNumb + "]";
	}


	
}
