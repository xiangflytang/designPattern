package com.disignpattern.simplefactory;

public class OperationSub extends Operation {
	@Override
	public double getResult() {
		return getA() - getB();
	}
}
