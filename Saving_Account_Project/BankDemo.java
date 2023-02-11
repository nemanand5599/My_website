package Saving_Account_Project;

public class BankDemo{

	    public static void main(String[] args) {
	        BankAccount checking = new BankAccount("Checking Account", 10000);
	        BankAccount savings = new BankAccount("Savings Account", 10000);

	        checking.deposit(1000);
	        checking.withdraw(2500);
	        checking.deposit(1500);

	        savings.withdraw(1000);
	        savings.deposit(500);
	        savings.withdraw(1500);

	        
	        savings.printTransactions();
	        checking.printTransactions();
	    }
	}



