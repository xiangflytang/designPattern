package com.disignpattern.simplefactory;

public class OperationMul extends Operation {
	@Override
	public double getResult() {
		return getA() * getB();
	}
}
