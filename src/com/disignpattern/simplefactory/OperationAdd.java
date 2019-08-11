package com.disignpattern.simplefactory;

public class OperationAdd extends Operation {
	@Override
	public double getResult() {
		return getA() + getB();
	}
}
