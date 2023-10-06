package expensetracker;

import java.util.List;

class Expenses {

}

public class ExpensesList {

	private List<Expenses> expensesList;

	
	public ExpensesList() {
		this.expensesList = expensesList;
	}

	
	public void addExpense(Expenses expenses) {
		expensesList.add(expenses);

		System.out.println("Expense successfully added!");
	}

	public void removeExpense(int index) {
        if (index >= 0 && index < expensesList.size()) {
            Expenses removedExpense = expensesList.remove(index);
            System.out.println("Expense removed: $" + removedExpense);
        } else {
            System.out.println("Invalid index. Expense not removed.");
        }
    }	
	
	public int searchList(List ExpensesList) {
		return expensesList.indexOf(ExpensesList);
	}
	
}

