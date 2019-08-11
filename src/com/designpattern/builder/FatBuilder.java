package com.designpattern.builder;

public class FatBuilder extends Builder {
	
	@Override
	public void buildPartA() {
		products.addPart("Fat PartA");
	}
	@Override
	public void buildPartB() {
		products.addPart("Fat PartB");
	}
	
}
