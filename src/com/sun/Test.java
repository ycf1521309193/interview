package com.sun;

import java.math.BigDecimal;

/**
 * 测试ABCD分别花了多少钱
 * @author ycf15
 * @date 20240507
 *
 */
public class Test {

	public static void main(String[] args) {
		BigDecimal aTotalPrice = BuyWay.A(new BigDecimal(4), new BigDecimal(5));
		System.out.println("A一共花费"+aTotalPrice+"元");
		
		BigDecimal bTotalPrice = BuyWay.B(new BigDecimal(4), new BigDecimal(5), new BigDecimal(6));
		System.out.println("B一共花费"+bTotalPrice+"元");
		
		BigDecimal cTotalPrice = BuyWay.C(new BigDecimal(4), new BigDecimal(5), new BigDecimal(6));
		System.out.println("C一共花费"+cTotalPrice+"元");
		
		BigDecimal dTotalPrice = BuyWay.D(new BigDecimal(4), new BigDecimal(5), new BigDecimal(6));
		System.out.println("D一共花费"+dTotalPrice+"元");
	
	}
}
