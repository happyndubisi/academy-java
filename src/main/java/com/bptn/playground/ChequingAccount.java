package com.bptn.playground;

class ChequingAccount extends BankAccount {
	
	private double overDraftLimit;

	public ChequingAccount(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		this.overDraftLimit = overDraftLimit;
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amount) {
		if(amount >0 && amount <=(getBalance() + overDraftLimit)) {
			super.withdraw(amount);
		}
	}

}
