package com.bptn.playground;

public class BankSystem {

	public static void main(String[] args) {
		
		BankAccount testAccount = new BankAccount("345678", 1200.00);
		
		testAccount.displayAccountInfo();
		
		BankAccount newTestAccount = new BankAccount("345678", 1200.00);
		newTestAccount.displayAccountInfo();
		
		SavingsAccount myAccount = new SavingsAccount("SAVING123", 500.00, 1.00 );
		myAccount.applyInterest(); 
		myAccount.displayAccountInfo();
		
		ChequingAccount myAccount = new ChequingAccount("12344", 500,200);
				myAccount.withdraw(amount);
		
		
	}

}
