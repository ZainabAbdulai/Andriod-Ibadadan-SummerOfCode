package com.makotojava.intro;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Manager extends Employee implements StockOptionRecipient {
	private static final Logger log = Logger.getLogger(Manager.class.getName());

	@Override
	public void processStockOptions(int numberOfOptions, BigDecimal price) {
		log.info("I can't believe I got " + numberOfOptions + " options at $" +
				price.toPlainString() + "!");
		// TODO Auto-generated method stub
		
	}

}
