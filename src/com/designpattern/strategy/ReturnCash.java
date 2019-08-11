package com.designpattern.strategy;

public class ReturnCash implements CashFee {

	private double condition;
	private double moneyReturn;

	public ReturnCash(double condition, double moneyReturn) {
		this.condition = condition;
		this.moneyReturn = moneyReturn;
	}

	public double acceptCash(double money) {
		double result = money;
		if (money > condition) {
			result = result - Math.floor(money / condition) * moneyReturn;
		}
		return money;
	}

}
