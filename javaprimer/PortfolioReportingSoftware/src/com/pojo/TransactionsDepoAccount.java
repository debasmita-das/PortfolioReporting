package com.pojo;

public class TransactionsDepoAccount {

	private SecurityType securityType;
	private Security security;
	private String transactionId;
	private String type;
	private String flag;
	private int volume;
	private String buyDate;
	private double buyPrice;
	public TransactionsDepoAccount(SecurityType securityType, Security security, String transactionId, String type,
			String flag, int volume, String buyDate, double buyPrice) {
		this.securityType = securityType;
		this.security = security;
		this.transactionId = transactionId;
		this.type = type;
		this.flag = flag;
		this.volume = volume;
		this.buyDate = buyDate;
		this.buyPrice = buyPrice;
	}
	public SecurityType getSecurityType() {
		return securityType;
	}
	public void setSecurityType(SecurityType securityType) {
		this.securityType = securityType;
	}
	public Security getSecurity() {
		return security;
	}
	public void setSecurity(Security security) {
		this.security = security;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	@Override
	public String toString() {
		return "TransactionsDepoAccount [securityType=" + securityType + ", security=" + security + ", transactionId="
				+ transactionId + ", type=" + type + ", flag=" + flag + ", volume=" + volume + ", buyDate=" + buyDate
				+ ", buyPrice=" + buyPrice + "]";
	}
	
	
	
}
