package org.bellotech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class mainDisplay {
	
	static List<String> categories = new ArrayList<>();

	public static void main(String[] args) {

		 // User and Registration: Bello Class
		
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Press 1...new user ");
		 * System.out.println("Press 2...login in "); int press = sc.nextInt(); switch
		 * (press) { case 1: UserRegistration userRegistration = new UserRegistration();
		 * userRegistration.userReg(); userRegistration.loginCheck(); break; case 2:
		 * UserRegistration user = new UserRegistration(); user.loginCheck(); }
		 */
		
		/*
		 * System.out.print("1. expense " ); System.out.print("2. expenses List " );
		 * System.out.print("3. Report " ); int input = sc.nextInt(); switch (input) {
		 * case 1: Expenses expenses = new Expenses(); expenses.addCategories("rice");
		 * 
		 * expenses.displayCategoriesList();
		 * 
		 * expenses.totalExpense(null); case 2: ExpensesList expenseList = new
		 * ExpensesList(); expenseList.addExpense(null, null, input, null);
		 * expenseList.displayExpense(); expenseList.show(); case 3: Report report = new
		 * Report(null, null);
		 * 
		 * report.generateDailyReport();
		 * 
		 * }
		 */
		
        List<Expenses> expenses = new ArrayList<>();
        expenses.add(new Expenses("Rent", 1000.0, LocalDate.of(2023, 1, 1)));
        expenses.add(new Expenses("Groceries", 200.0, LocalDate.of(2023, 1, 5)));
        expenses.add(new Expenses("Utilities", 150.0, LocalDate.of(2023, 1, 10)));

        LocalDate specificDate = LocalDate.of(2023, 1, 5); 
        Report report = new Report(specificDate, expenses);
        
        

        System.out.println(report.generateDailyReport());
        
    
		
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
		/*
		 * // expenses object Expenses expense = new Expenses(); Scanner sc = new
		 * Scanner(System.in); System.out.print("input to category : "); String
		 * inputList = sc.nextLine(); expense.addCategories(inputList); ExpensesList
		 * expensesList = new ExpensesList(); expensesList.addExpense(inputList, null,
		 * 4545, new Date()); expensesList.displayExpense();
		 */
		
}
}

