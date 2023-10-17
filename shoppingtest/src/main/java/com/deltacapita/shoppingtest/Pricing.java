package com.deltacapita.shoppingtest;

public class Pricing {

	private static final Long applePrice=35l;
	private static final Long bananaPrice=20l;
	private static final Long melonPrice=50l;
	private static final Long limePrice=15l;
	
	public static Long getApplePrice(Long quantity) {
		return applePrice*quantity;
	}
	
	public static Long getBananaPrice(Long quantity) {
		return bananaPrice*quantity;
	}
	
	public static Long getMelonPrice(Long quantity) {
		if(quantity % 2 == 0) {
			quantity /= 2;
			return melonPrice*quantity;
		} else {
			quantity -= 1;
			quantity /= 2;
			return melonPrice * (1+ quantity);
			
		}
	}
	
	public static Long getLimePrice(Long quantity) {
		Long tempPrice = (quantity / 3) * 2 * limePrice;
		Long price = tempPrice + ((quantity % 3) * limePrice);
		return price;
	}
	
	
	
}
