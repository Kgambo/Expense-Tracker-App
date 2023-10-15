package org.bellotech;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.time.LocalDate;
import java.util.List;

import java.time.LocalDate;
import java.util.List;

public class Report  {
	private LocalDate date;
	private List<Expenses> expenses;

	public Report(LocalDate date, List<Expenses> expenses) {
		this.date = date;
		this.expenses = expenses;
	}


    public String generateDailyReport() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy"); // Format the date as "day month year"
        String formattedDate = date.format(formatter);
        
        String report = "Daily Report for " + formattedDate + "\n";
        for (Expenses expense : expenses) {
            if (expense.getDate().isEqual(date)) {
                report += expense.getDescription() + " - $" + expense.getAmount() + "\n";
            }
        }
        return report;
    }

	public String generateMonthlyReport() {
		String report = "Monthly Report for " + date.getMonth() + " " + date.getYear() + "\n";
		for (Expenses expense : expenses) {
			report += expense.toString() + "\n";
		}
		return report;
	}

	/*
	 * @Override public String toString() { return "Report [date=" + date +
	 * ", expenses=" + expenses + "]"; }
	 */
	
}
