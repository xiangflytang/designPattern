package com.designpattern.dynamic.proxy;

import java.lang.reflect.Proxy;

public class Main {
	 public static void main(String args[]) {
		 //from https://www.byteslounge.com/tutorials/jdk-dynamic-proxies
		 // in java8 the  functional interface
		 
			// create the target instance
			ServiceOne serviceOne = new ServiceOneBean();
			//This method receives three arguments: 
			//The class loader that will be responsible for loading our proxy instance, 
			//the interfaces that our proxy will implement, 
			//and finally the user defined proxy (the one that implements the InvocationHandler interface).
			ServiceOne proxy = (ServiceOne)Proxy.newProxyInstance(ServiceOne.class.getClassLoader(),
					serviceOne.getClass().getInterfaces(), new LogExecutionTimeProxy(serviceOne));
			String result = proxy.sayHello();
			System.out.println("Result: "+result);
	 }
}
