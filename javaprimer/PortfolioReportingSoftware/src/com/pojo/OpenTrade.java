package com.pojo;

public class OpenTrade extends TransactionsDepoAccount{
	private double currentPrice;

	public OpenTrade(SecurityType securityType, Security security, String transactionId, String type, String flag,
			int volume, String buyDate, double buyPrice, double currentPrice) {
		super(securityType, security, transactionId, type, flag, volume, buyDate, buyPrice);
		this.currentPrice = currentPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	@Override
	public String toString() {
		return "OpenTrade [currentPrice=" + currentPrice + "]";
	}
	
	

}
