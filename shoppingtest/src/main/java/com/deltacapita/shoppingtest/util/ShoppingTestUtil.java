package com.deltacapita.shoppingtest.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShoppingTestUtil {

	public static Double paiseToRuppes(Double rupees) {
		Double l = (double) (rupees / 100);
		BigDecimal bd = BigDecimal.valueOf(l);
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
	    return bd.doubleValue();
    }
}
