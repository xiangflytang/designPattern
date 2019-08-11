package com.designpattern.builder;

public class ThinBuilder extends Builder {
	@Override
	public void buildPartA() {
		products.addPart("ThinPart A");
	}
	@Override
	public void buildPartB() {
		products.addPart("ThinPart B");
	}

}
