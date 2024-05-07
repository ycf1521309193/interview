package com.sun;

import java.math.BigDecimal;

/**
 * 购买方案
 * @author ycf
 * @date 20240507
 *
 */
public class BuyWay {

	public static BigDecimal A(BigDecimal appleWeight,BigDecimal strawberryWeight) {
		
		BigDecimal totalPrice = new BigDecimal(0);
		BigDecimal appleTotalPrice = FruitPriceConstant.APPLE_PRICE.multiply(appleWeight);
		BigDecimal strawberryTotalPrice = FruitPriceConstant.STRAWBERRY_PRICE.multiply(strawberryWeight);
		totalPrice = appleTotalPrice.add(strawberryTotalPrice);
		
		
		return totalPrice.setScale(2,BigDecimal.ROUND_HALF_UP);
		
	}
	
	public static BigDecimal B(BigDecimal appleWeight,BigDecimal strawberryWeight,BigDecimal mangoWeight) {
		BigDecimal totalPrice = new BigDecimal(0);
		BigDecimal aTotalPrice = A(appleWeight,strawberryWeight);
		BigDecimal mangoTotalPrice = FruitPriceConstant.MANGO_PRICE.multiply(mangoWeight);
		totalPrice = aTotalPrice.add(mangoTotalPrice);
	
		return totalPrice.setScale(2,BigDecimal.ROUND_HALF_UP);
		
	}
	
	public static BigDecimal C(BigDecimal appleWeight,BigDecimal strawberryWeight,BigDecimal mangoWeight) {
		BigDecimal totalPrice = new BigDecimal(0);
		BigDecimal appleTotalPrice = FruitPriceConstant.APPLE_PRICE.multiply(appleWeight);
		BigDecimal strawberryTotalPrice = FruitPriceConstant.STRAWBERRY_PRICE.multiply(new BigDecimal(0.8)).multiply(strawberryWeight);
		BigDecimal mangoTotalPrice = FruitPriceConstant.MANGO_PRICE.multiply(mangoWeight);
		totalPrice = appleTotalPrice.add(strawberryTotalPrice).add(mangoTotalPrice);
		
		return totalPrice.setScale(2,BigDecimal.ROUND_HALF_UP);
		
	}
	
	public static BigDecimal D(BigDecimal appleWeight,BigDecimal strawberryWeight,BigDecimal mangoWeight) {
		
		BigDecimal totalPrice = C(appleWeight,strawberryWeight,mangoWeight);
		if(totalPrice.compareTo(new BigDecimal(100)) > 0) {
			totalPrice = totalPrice.subtract(new BigDecimal(10));
		}
		
		return totalPrice.setScale(2,BigDecimal.ROUND_HALF_UP);
	}
}
