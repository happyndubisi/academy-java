package com.bptn.playground;

class SavingsAccount extends BankAccount{
	
	private double interestRate;

	public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);
		this.interestRate = interestRate;
		// TODO Auto-generated constructor stub
	}
	
	public void applyInterest() {
		double interest = getBalance() * interestRate/100;
		deposit(interest);
	}
	

}
