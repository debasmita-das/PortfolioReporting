package com.pojo;

public class TransactionsSavingsAccount {
	
	private String transactionId;
	private String transactionDate;
	private String type;
	private double amount;
	private double balance;
	private String description;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TransactionsSavingsAccount [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", type=" + type + ", amount=" + amount + ", balance=" + balance + ", description=" + description
				+ "]";
	}
	
	

}
