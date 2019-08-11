package com.designpattern.strategy;

public class Context {
	private CashFee cashFee;
	public Context(String type,double discount, double condition, double returnMoney) {
		
		switch(type) {
			case "normal":
				cashFee = new NormalCash();
				break;
			case "rebatecash":
				cashFee = new RebateCash(discount);
				break;
			case "returncash":
				cashFee = new ReturnCash(condition, returnMoney);
				break;
		}
	}
	
	public double getResult(double money) {
		return cashFee.acceptCash(money);
	}
	
	
}
