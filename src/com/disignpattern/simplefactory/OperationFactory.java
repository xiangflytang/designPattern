package com.disignpattern.simplefactory;

public class OperationFactory {
	public static Operation getOperation(String s) {
		Operation operation = null;
		switch (s) {
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSub();
			break;
		case "*":
			operation = new OperationMul();
			break;
		case"/":
			operation = new OperationDiv();
			break;
		}
			
		return operation;
	}
}
