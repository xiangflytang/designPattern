package com.designpattern.strategy;

public class RebateCash implements CashFee {
	private double discount;

	public RebateCash(double discount) {
		this.discount = discount / 10;
	}

	public double acceptCash(double money) {

		return money * discount;
	}

}
