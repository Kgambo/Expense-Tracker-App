package org.bellotech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Expenses {
	public int transID;
	public List<String> categories;
	public LocalDate date;
	public Double amount;
	public String description;

	public Expenses() {

		this.transID = transID;
		this.categories = new ArrayList<>();
		this.date = date;
		this.amount = amount;
		this.description = description;
	}

	public Expenses(String description, double amount, LocalDate date) {
		 this.description = description;
	        this.amount = amount;
	        this.date = date;
	}
	
	  @Override
	    public String toString() {
	        return description + ": $" + amount + " on " + date;
	    }

	public int getTransID() {
		return transID;
	}

	public List<String> getCategories() {
		return categories;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

	public void setTransID(int transID) {
		this.transID = transID;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void addCategories(String categoriesList) {

		categories.add(categoriesList);

	}

	public void displayCategoriesList() {

		for (String categoriesList : categories) {
			
			System.out.println("CATEGORY LIST : " + categoriesList);
		}
		
		

	}
	
    public  double totalExpense(List<Expenses> expenses) {
        double total = 0;
        for (Expenses expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

}
