package com.bptn.playground;

class BankAccount {
	
	
// data memebers/ properties
	private String accountNumber;
	private double balance;
	
	// constructors
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
		
	}
	// instance method, class method, behavior
	public void deposit(double amount) {
		if(amount >0) {
			balance += amount;
		}
	}
	public void withdraw(double amount){
		if(amount > 0 && amount<= balance) {
			balance -= amount;
		}
		
	}
	public double getBalance() {
		return balance;
	}
	public void displayAccountInfo() {
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Current Number: "+ balance);
	}

}
