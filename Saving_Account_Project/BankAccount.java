package Saving_Account_Project;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BankAccount {
	
	
	    private String accountType;
	    private int balance;
	    private ArrayList<String> transactions;

	    public BankAccount(String accountType, int initialBalance) {
	        this.accountType = accountType;
	        this.balance = initialBalance;
	        this.transactions = new ArrayList<String>();
	    }

		public void addTransaction(String transaction) {
	        this.transactions.add(transaction);
	    }

	    public void deposit(int amount) {
	        if (amount % 500 != 0) {
	            System.out.println("Error: amount must be a multiple of 500");
	            return;
	        }
	        this.balance += amount;
	        String transaction = String.format("%s Credit %d", getDate(), amount);
	        this.addTransaction(transaction);
	    }

	    public void withdraw(int amount) {
	        if (amount % 500 != 0) {
	            System.out.println("Error: amount must be a multiple of 500");
	            return;
	        }
	        if (this.balance < amount) {
	            System.out.println("Error: insufficient funds");
	            return;
	        }
	        this.balance -= amount;
	        String transaction = String.format("%s Debit %d", getDate(), amount);
	        this.addTransaction(transaction);
	    }
	    public void printTransactions() {
	        System.out.println(this.accountType + " Transactions");
	        for (String transaction : this.transactions) {
	            System.out.println(transaction);
	        }
	        System.out.printf("Final Balance = %d%n%n", this.balance);
	    }

	    private String getDate() {
	        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	        Date date = new Date();
	        return formatter.format(date);
	    }
	
}


