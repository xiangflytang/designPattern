package com.designpattern.proxy;

public class Demo {
	public static void main(String[] args) {
		// example from dahua sheji
		SchoolGirl yy = new SchoolGirl("yaoyao");
		Proxy proxy = new Proxy(yy);
		proxy.giveChocolate();
		proxy.giveDolls();
		proxy.giveFlowers();
	}
}
