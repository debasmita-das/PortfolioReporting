package com.dao;

import java.util.List;

import com.pojo.TradeSecurities;

public interface MarketDAO {

	List<TradeSecurities> marketHistory();
	
}
