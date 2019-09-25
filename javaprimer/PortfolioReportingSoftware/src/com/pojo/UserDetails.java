package com.pojo;

import java.util.List;

public class UserDetails {

	private String KYCNumber;
	private String aadharNumber;
	private String PANNumber; 
	private String userId;
	private String password;
	private String name;
	private String imagepath;
	private String gender;
	private String DOB;
	private String mobile;
	private String emailId;
	private String depoAccountNumber;
	private TransactionsDepoAccount transactionsDepoAccount;
	private List<SavingsAccountDetails> savingsAccountDetails;
	public UserDetails(String KYCNumber, String aadharNumber, String PANNumber, String userId, String password,
			String name, String imagepath, String gender, String DOB, String mobile, String emailId,
			String depoAccountNumber, TransactionsDepoAccount transactionsDepoAccount,
			List<SavingsAccountDetails> savingsAccountDetails) {
		super();
		this.KYCNumber = KYCNumber;
		this.aadharNumber = aadharNumber;
		this.PANNumber = PANNumber;
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.imagepath = imagepath;
		this.gender = gender;
		this.DOB = DOB;
		this.mobile = mobile;
		this.emailId = emailId;
		this.depoAccountNumber = depoAccountNumber;
		this.transactionsDepoAccount = transactionsDepoAccount;
		this.savingsAccountDetails = savingsAccountDetails;
	}
	public String getKYCNumber() {
		return KYCNumber;
	}
	public void setKYCNumber(String kYCNumber) {
		KYCNumber = kYCNumber;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPANNumber() {
		return PANNumber;
	}
	public void setPANNumber(String pANNumber) {
		PANNumber = pANNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDepoAccountNumber() {
		return depoAccountNumber;
	}
	public void setDepoAccountNumber(String depoAccountNumber) {
		this.depoAccountNumber = depoAccountNumber;
	}
	public TransactionsDepoAccount getTransactionsDepoAccount() {
		return transactionsDepoAccount;
	}
	public void setTransactionsDepoAccount(TransactionsDepoAccount transactionsDepoAccount) {
		this.transactionsDepoAccount = transactionsDepoAccount;
	}
	public List<SavingsAccountDetails> getSavingsAccountDetails() {
		return savingsAccountDetails;
	}
	public void setSavingsAccountDetails(List<SavingsAccountDetails> savingsAccountDetails) {
		this.savingsAccountDetails = savingsAccountDetails;
	}
	@Override
	public String toString() {
		return "UserDetails [KYCNumber=" + KYCNumber + ", aadharNumber=" + aadharNumber + ", PANNumber=" + PANNumber
				+ ", userId=" + userId + ", password=" + password + ", name=" + name + ", imagepath=" + imagepath
				+ ", gender=" + gender + ", DOB=" + DOB + ", mobile=" + mobile + ", emailId=" + emailId
				+ ", depoAccountNumber=" + depoAccountNumber + ", transactionsDepoAccount=" + transactionsDepoAccount
				+ ", savingsAccountDetails=" + savingsAccountDetails + "]";
	} 
	
	
	
}
