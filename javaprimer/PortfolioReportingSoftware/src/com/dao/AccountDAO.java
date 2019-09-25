package com.dao;

import java.util.HashMap;
import java.util.List;

import com.pojo.*;

public interface AccountDAO {

	boolean authentication(String userId, String password);
	UserDetails userdetails(String userId);
	double totalSavingsBalance(String userId);
	List<Double> generateCurrentPrice(List<Double> buyPrice );
	double currentValueOfTrade();
	List<SavingsAccountDetails> savingsAccountDetails(String userId);
	double[] calculatePL(String flag);
	//List<Object> showAllUserTrades();
	List<CloseTrade> showUserCloseTrades(); // or <Object>
	List<OpenTrade> showUserOpenTrades();
	List<HashMap<String, Double>> securityMovement();

	
}
