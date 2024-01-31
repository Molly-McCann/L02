
// Molly McCann
// 01.30.2024

public class MainBankAccount {

	public static void main(String[] args) {
		// Creating 5 objects of the BankAccount class
		BankAccount ba1 = new BankAccount("123", 0.00, "Hannah", false);
		BankAccount ba2 = new BankAccount("752", 229.43, "Grace", true);
		BankAccount ba3 = new BankAccount("234", 923.01, "Chris", true);
		BankAccount ba4 = new BankAccount("190", 554.92, "Joe", false);
		BankAccount ba5 = new BankAccount("327", 334.70, "Hailey", true);

		// BankAccount myAccountNumber = new BankAccount();
		// String valueAccountNumber = myAccountNumber.getAccountNumber(); // Retrieved the value of accountNumber
		
		// BankAccount myBalance = new BankAccount();
		// double valueBalance = myBalance.getBalance(); // Retrieved the value of balance
		
		// BankAccount myAccountHolderName = new BankAccount();
		// String valueAccountHolderName = myAccountHolderName.getAccountHolderName(); // Retrieved value of accountHolderName
		
		// BankAccount myIsSavingsAccount = new BankAccount();
		// boolean valueIsSavingsAccount = myIsSavingsAccount.getIsSavingsAccount(); // Retrieved value of isSavingsAccount
		
		System.out.println(ba1.isBalanceZero());
		System.out.println(ba2.isBalanceZero());
		System.out.println(ba3.isBalanceZero());
		System.out.println(ba4.isBalanceZero());
		System.out.println(ba5.isBalanceZero());
		
		// Part B 
		System.out.println(ba1.accountDeposit(100.00));
		System.out.println(ba2.accountDeposit(100.00));
		System.out.println(ba3.accountDeposit(100.00));
		System.out.println(ba4.accountDeposit(100.00));
		System.out.println(ba5.accountDeposit(100.00));
		
		// Part C 
		System.out.println(ba1.accountWithdrawal(50.00));
		System.out.println(ba2.accountWithdrawal(50.00));
		System.out.println(ba3.accountWithdrawal(50.00));
		System.out.println(ba4.accountWithdrawal(50.00));
		System.out.println(ba5.accountWithdrawal(50.00));
		
		
	}
	
}
