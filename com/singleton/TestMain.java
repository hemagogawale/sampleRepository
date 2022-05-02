package com.singleton;

public class TestMain implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton Obj1=Singleton.getInstance();
		Singleton Obj2=(Singleton) Obj1.clone();
		System.out.println(Obj1.hashCode());
		System.out.println(Obj2.hashCode());
	}
	

}
