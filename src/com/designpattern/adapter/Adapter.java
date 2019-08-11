package com.designpattern.adapter;

public class Adapter implements Target {
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		adaptee.specialRequest();
	}
}
