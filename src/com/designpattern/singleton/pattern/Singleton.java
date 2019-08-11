package com.designpattern.singleton.pattern;

// from runoob.com 
//3������ʽ
//�Ƿ� Lazy ��ʼ������
//
//�Ƿ���̰߳�ȫ����
//
//ʵ���Ѷȣ���
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

