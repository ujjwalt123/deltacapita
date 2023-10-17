package com.deltacapita.shoppingtest;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.reflect.internal.WhiteboxImpl;

import com.deltacapita.shoppingtest.util.Constants;

/**
 * Unit test for simple App.
 */
@PrepareForTest(ShoppingBasketAssessment.class)
public class ShoppingBasketAssessmentTest {
	
	private ShoppingBasketAssessment targetTest;
    /**
     * Rigorous Test :-)
     * @throws Exception 
     */
    @Test
    public void testTotalCost() throws Exception {
    	targetTest = new ShoppingBasketAssessment();
    	List<String> basket = new LinkedList<>();
        basket.add(Constants.APPLE);
        basket.add(Constants.APPLE);
        basket.add(Constants.BANANA);
        basket.add(Constants.MELON);
        
        WhiteboxImpl.invokeMethod(targetTest, "totalCost", basket);
    }
}
