package com.singleton.usingSerialization;

import java.io.Serializable;

public class Singleton implements Serializable{ 
	
	private static Singleton Obj=null;
	
	private Singleton() {
		if(Obj!=null) {
			throw new IllegalAccessError("djkfdkfj");
		}
	}
	
	protected Object readResolve() {
		return Obj;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return Obj;
	}


	public static Singleton getInstance() {
		synchronized(Singleton.class) {
			if(Obj==null) {
				Obj=new Singleton();
			}
		}
		return Obj;
	}
	
	public static void main(String[] args) {
		Singleton Obj1=Singleton.getInstance();
		System.out.println(Obj1.hashCode());
		
		Singleton Obj2=Singleton.getInstance();
		System.out.println(Obj2.hashCode());
		
	}

}
