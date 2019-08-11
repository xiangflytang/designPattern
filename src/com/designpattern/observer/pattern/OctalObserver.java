package com.designpattern.observer.pattern;

public class OctalObserver extends Observer{
	 
	   public OctalObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	 
	   @Override
	   public void update() {
	      System.out.println( "Binary String: " 
	      + Integer.toBinaryString( subject.getState() ) ); 
	   }
	}