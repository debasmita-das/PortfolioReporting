package com.pojo;

import java.util.List;

public class SavingsAccountDetails {

	private String accountNumber;
	private double savingsAccountBalance;
	List<TransactionsSavingsAccount> transactionsSavingsAccounts;
	
	
	public SavingsAccountDetails(String accountNumber, double savingsAccountBalance,
			List<TransactionsSavingsAccount> transactionsSavingsAccounts) {
		this.accountNumber = accountNumber;
		this.savingsAccountBalance = savingsAccountBalance;
		this.transactionsSavingsAccounts = transactionsSavingsAccounts;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getsavingsAccountBalance() {
		return savingsAccountBalance;
	}
	public void setsavingsAccountBalance(double balance) {
		this.savingsAccountBalance = balance;
	}
	@Override
	public String toString() {
		return "SavingsAccountDetails [accountNumber=" + accountNumber + ", balance=" + savingsAccountBalance + "]";
	}
	

}
