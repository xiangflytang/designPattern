package com.disignpattern.simplefactory;

import java.util.Scanner;
// referenced 
// https://blog.csdn.net/bskfnvjtlyzmv867/article/details/73525545
public class FactoryDemo {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your 1st number");
			double d1 = sc.nextDouble();
			System.out.println("Enter your 2nd number");
			double d2 = sc.nextDouble();
			System.out.println("Enter your operator");
			String operator = sc.next();
			Operation operation = OperationFactory.getOperation(operator);
			operation.setA(d1);
			operation.setB(d2);
			System.out.println("the result :" + operation.getResult());
			sc.close();
		} catch (Exception e) {
			System.err.println("error in calcultion: " + e.getMessage());
		}
	}
}
