package com.dao;

import com.pojo.CloseTrade;
import com.pojo.OpenTrade;


public interface BackdatingDAO {

	boolean backdateCloseTrades(CloseTrade closeTrade);
	boolean backdateOpenTrades(OpenTrade openTrade);
	
}
