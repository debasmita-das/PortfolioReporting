package com.pojo;

public class Security {

	private int securityId;
	private String securityName;
	private String category;
	public Security(int securityId, String securityName, String category) {
		super();
		this.securityId = securityId;
		this.securityName = securityName;
		this.category = category;
	}
	public int getSecurityId() {
		return securityId;
	}
	public void setSecurityId(int securityId) {
		this.securityId = securityId;
	}
	public String getSecurityName() {
		return securityName;
	}
	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Security [securityId=" + securityId + ", securityName=" + securityName + ", category=" + category + "]";
	}
	
	
}
