package com.designpattern.proxy;

public class Pursuit implements GiveGifts
{	public Pursuit(SchoolGirl mm) {
		this.mm = mm;
	}

private SchoolGirl mm;

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"give dolls");
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"give flowers");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"give Chocolate");
	}
	
	
}
