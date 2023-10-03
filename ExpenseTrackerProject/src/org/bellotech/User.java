package org.bellotech;

import java.util.Scanner;

public class User{
	public String userID;
	public String email;
	public String password;
	public String address;
	public int phoneNumb;

	
	
	public User(String userID, String email, String password, String address, int phoneNumb) {

		this.userID = userID;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneNumb = phoneNumb;
		
		
		
	}
	


	public String getUserID() {
		return userID;
	}



	public void setUserID(String userID) {
		this.userID = userID;
	}



	public String getEmail() {
		return email;
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



	public void authCheck() {
		char ch;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter username");
			String username = sc.nextLine();		
			System.out.println("Enter password");
			String setPassword = sc.nextLine();
			if (username.equals(userID)  && setPassword.equals(password)) {
				System.out.println("Welcome User");
				break;
			}else {
				System.out.println("Access Denied");
			}
			System.out.println("Do you want to continue? " + "Y for yes/ N for no");
			
			 ch = sc.next().charAt(0);
			
			 
			
	}while(ch == 'Y'  || ch == 'Y');
		
	
	
}
}
