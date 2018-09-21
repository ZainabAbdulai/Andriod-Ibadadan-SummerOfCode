package com.makotojava.intro;

import java.math.BigDecimal;

public interface StockOptionRecipient {
	void processStockOptions(int numberOfOptions, BigDecimal price);
}
