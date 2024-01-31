
// Molly McCann
// 01.30.2024

public class BankAccount {

	// Private instance variables 
	private String accountNumber;
	private double balance; 
	private String accountHolderName;
	private boolean isSavingsAccount;
	
	// Initializes the variables with constructors
	public BankAccount(String accountNumber_, double balance_, String accountHolderName_, boolean isSavingsAccount_) {
		this.accountNumber = accountNumber_;
		this.balance = balance_;
		this.accountHolderName = accountHolderName_;
		this.isSavingsAccount = isSavingsAccount_;
	}
	
	// Getter method to retrieve the value of accountNumber
	public String getAccountNumber() {
		return accountNumber;
	}
	
	// Getter method to retrieve the value of balance
	public double getBalance() { 
		return balance;
	}
	
	// Getter method to retrieve the value of accountHolderName
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	// Getter method to retrieve the value of isSavingsAccount
	public boolean getIsSavingsAccount() {
		return isSavingsAccount;
	}
	
	// Method to check if the balance is zero
	public boolean isBalanceZero() {
		return balance == 0.0;
	}
	
	// Method responsible for deposit 
	public double accountDeposit(double deposit) {
		balance = balance + deposit;
		return balance;
	}

	// Method responsible for withdraw 
	public double accountWithdrawal(double withdrawal) {
		balance = balance - withdrawal;
		return balance;
	}
}
