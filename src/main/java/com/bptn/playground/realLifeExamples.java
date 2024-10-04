package com.bptn.playground;

public class realLifeExamples {

	public class BankAccount {
	    private double balance;

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }
	}

}
