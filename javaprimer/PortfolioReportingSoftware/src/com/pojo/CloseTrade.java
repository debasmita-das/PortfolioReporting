package com.pojo;

public class CloseTrade extends TransactionsDepoAccount{
	
	private String sellDate;
	private double sellPrice;
	public CloseTrade(SecurityType securityType, Security security, String transactionId, String type, String flag,
			int volume, String buyDate, double buyPrice, String sellDate, double sellPrice) {
		super(securityType, security, transactionId, type, flag, volume, buyDate, buyPrice);
		this.sellDate = sellDate;
		this.sellPrice = sellPrice;
	}
	public String getSellDate() {
		return sellDate;
	}
	public void setSellDate(String sellDate) {
		this.sellDate = sellDate;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}
	@Override
	public String toString() {
		return "CloseTrade [sellDate=" + sellDate + ", sellPrice=" + sellPrice + "]";
	}
	
	

}
