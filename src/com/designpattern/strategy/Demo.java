package com.designpattern.strategy;

public class Demo {

	public static void main(String[] args) {
		Double money = 100.0;
		Context cc = new Context("rebatecash", 7, 0, 0);
		System.out.println("price: " + cc.getResult(money));
	}

}
