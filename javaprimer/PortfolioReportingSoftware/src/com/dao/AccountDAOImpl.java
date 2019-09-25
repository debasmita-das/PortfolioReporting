package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.pojo.CloseTrade;
import com.pojo.OpenTrade;
import com.pojo.SavingsAccountDetails;
import com.pojo.UserDetails;

public class AccountDAOImpl implements AccountDAO {
	
	private Connection openConnection()
	{		Connection connection = null;
		try 
		{	Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); 
			System.out.println("Connection open");
		} 
		catch (ClassNotFoundException e) 
		{	e.printStackTrace();
		}
		catch (SQLException e) 
		{	e.printStackTrace();
		}
		return connection;
	}
	
	
	@Override
	public boolean authentication(String userId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDetails userdetails(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double totalSavingsBalance(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Double> generateCurrentPrice(List<Double> buyPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double currentValueOfTrade() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SavingsAccountDetails> savingsAccountDetails(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double[] calculatePL(String flag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CloseTrade> showUserCloseTrades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OpenTrade> showUserOpenTrades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HashMap<String, Double>> securityMovement() {
		// TODO Auto-generated method stub
		return null;
	}

}
