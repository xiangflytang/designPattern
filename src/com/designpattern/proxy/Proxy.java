package com.designpattern.proxy;

public class Proxy implements GiveGifts{
	public Proxy(SchoolGirl mm) {
		this.pursuit = new Pursuit(mm);
	}

	Pursuit pursuit;
	
	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		pursuit.giveDolls();
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		pursuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		pursuit.giveChocolate();
	}

}
