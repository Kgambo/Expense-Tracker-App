package org.bellotech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class mainDisplay {
	
	static List<String> categories = new ArrayList<>();

	public static void main(String[] args) {

		/*
		 * User and Registration
		 * 
		 * Scanner sc = new Scanner(System.in);
		System.out.println("Press 1...new user ");
		System.out.println("Press 2...login in ");
		int press = sc.nextInt();
		switch (press) {
		case 1:
			UserRegistration check = new UserRegistration();
			check.userReg();
			break;
		case 2:
			User user = new User();
			user.loginCheck();
			break;
		}
		User user = new User();
		user.loginCheck(); */
		
		/*Expenses
		Expenses expense = new Expenses();
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.print("Enter the list of your Category please Or type quit to STOP : ");
			
		String inputList = sc.nextLine();
		if(inputList.equalsIgnoreCase("quit")) 
			break;
		
		
		expense.addCategories(inputList);
	
		}
		
		expense.displayCategoriesList();*/
		// expenses object
		Expenses expense = new Expenses();
		Scanner sc = new Scanner(System.in);
		System.out.print("input to category : ");
		String inputList = sc.nextLine();
		expense.addCategories(inputList);
		ExpensesList expensesList = new ExpensesList();
		expensesList.addExpense(inputList, null, 4545, new Date());
		expensesList.displayExpense();
	}
	
}

