package com.disignpattern.simplefactory;

public class OperationDiv extends Operation {
	@Override
	public double getResult() {
		
		return getA() / getB();
	}
}
