package com.designpattern.builder;

public abstract class Builder {

	protected Products products= new Products();
	public  abstract void buildPartA();

	public abstract  void buildPartB();
	
	public Products getResults() {
		return products;
	}
}
