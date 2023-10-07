package org.bellotech;

import java.util.ArrayList;
import java.util.List;

public class Report extends ExpensesList{
	
	public List<ExpensesList> daily;
	public List<ExpensesList> monthly;
	public Report(List<ExpensesList> daily, List<ExpensesList> monthly) {
		
		this.daily = new ArrayList<>();
		this.monthly =new ArrayList<>();
	}

	
	
}
