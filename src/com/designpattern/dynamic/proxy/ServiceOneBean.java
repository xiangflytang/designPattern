package com.designpattern.dynamic.proxy;

public class ServiceOneBean implements ServiceOne{
	@Override
	public String sayHello() {
		System.out.println("Executing method sayHello");
		return "Hello";
	}
}
