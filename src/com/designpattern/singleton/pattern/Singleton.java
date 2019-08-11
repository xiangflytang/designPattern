package com.designpattern.singleton.pattern;

// from runoob.com 
//3、饿汉式
//是否 Lazy 初始化：否
//
//是否多线程安全：是
//
//实现难度：易
class Singleton {
	private static Singleton  instance = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		return instance;
	}
	
}

// DCL double-checked locking
class SingletonDCL {  
	 private volatile static SingletonDCL singleton;  
	 private SingletonDCL (){}
	 public static SingletonDCL getSingleton() {
		 if(singleton == null) {
			 synchronized(SingletonDCL.class){
				 if(singleton == null) {
					 singleton = new SingletonDCL();
				 }
			 }
		 }
		 return singleton;
	 }
	    
}

