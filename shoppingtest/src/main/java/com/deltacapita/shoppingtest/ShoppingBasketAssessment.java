package com.deltacapita.shoppingtest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.deltacapita.shoppingtest.util.Constants;
import com.deltacapita.shoppingtest.util.ShoppingTestUtil;

/**
 * Shopping Basket Assessment
 *
 */
public class ShoppingBasketAssessment 
{
	public static void main( String[] args )
    {
        List<String> basket = new LinkedList<>();
        basket.add(Constants.APPLE);
        basket.add(Constants.APPLE);
        basket.add(Constants.BANANA);
        basket.add(Constants.MELON);
        ShoppingBasketAssessment shoppingBasketAssessment = new ShoppingBasketAssessment();
        shoppingBasketAssessment.totalCost(basket);
    }
    
    private Double totalCost(List<String> basket) {
    	HashMap<String, Long> numberOfItems = basket.stream()
    			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
    	Double sum = 0.0;
    	for(Entry<String, Long> entry : numberOfItems.entrySet()) {
    		if(entry.getKey().equals(Constants.APPLE)) {
    			sum += Pricing.getApplePrice(entry.getValue());
    		}
    		if(entry.getKey().equals(Constants.BANANA)) {
    			sum += Pricing.getBananaPrice(entry.getValue());
    		}
    		if(entry.getKey().equals(Constants.MELON)) {
    			sum += Pricing.getMelonPrice(entry.getValue());
    		}
    		if(entry.getKey().equals(Constants.LIME)) {
    			sum += Pricing.getLimePrice(entry.getValue());
    		}
    	}
    	
    	return ShoppingTestUtil.paiseToRuppes(sum);
    }
}
