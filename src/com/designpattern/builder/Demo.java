package com.designpattern.builder;

public class Demo {
	public static void main(String[] args) {
		Director director = new Director();
		Builder builder = new FatBuilder();
		director.construct(builder);
		Products products =builder.getResults();
		products.getParts();
		
		builder = new ThinBuilder();
		director.construct(builder);
		products =builder.getResults();
		products.getParts();
	}
}
