package org.bellotech;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpensesList extends Expenses {
	
	public List<Expenses> expenses;

	public ExpensesList() {
		
		this.expenses = new ArrayList<>();
	}
	
	
	
	
	public String show() {
		return "ExpensesList [expenses=" + expenses + ", transID=" + transID + ", categories=" + categories + ", date="
				+ date + ", amount=" + amount + ", description=" + description + "]";
	}



	public void addExpense(String categoriesList, Double amount,int transID, Date date ) {
		
		ExpensesList newExpense = new ExpensesList();
		
		expenses.add(newExpense); 
		
	}
	
	public void displayExpense() {
		System.out.println("List of Expense : ");
		for (Expenses expens :expenses ) {
			System.out.println(expens);
		}
	}

}
