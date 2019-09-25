package com.pojo;

public class TradeSecurities {
	private Security security;
	private SecurityType securitytype;
	private String date;
	private double open;
	private double high;
	private double low;
	private double close;
	private int volume;
	
	public TradeSecurities(Security security, SecurityType securitytype, String date, double open, double high,
			double low, double close, int volume) {
		super();
		this.security = security;
		this.securitytype = securitytype;
		this.date = date;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
	}

	public Security getSecurity() {
		return security;
	}
	public void setSecurity(Security security) {
		this.security = security;
	}
	public SecurityType getSecuritytype() {
		return securitytype;
	}
	public void setSecuritytype(SecurityType securitytype) {
		this.securitytype = securitytype;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "TradeSecurities [security=" + security + ", securitytype=" + securitytype + ", date=" + date + ", open="
				+ open + ", high=" + high + ", low=" + low + ", close=" + close + ", volume=" + volume + "]";
	}
	
}
