package org.bellotech;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Expenses {
	public int transID;
	public List<String> categories;
	public Date date;
	public Double amount;
	public String description;

	public Expenses() {

		this.transID = transID;
		this.categories = new ArrayList<>();
		this.date = date;
		this.amount = amount;
		this.description = description;
	}

	public int getTransID() {
		return transID;
	}

	public List<String> getCategories() {
		return categories;
	}

	public Date getDate() {
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

	public void setDate(Date date) {
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
	

}
