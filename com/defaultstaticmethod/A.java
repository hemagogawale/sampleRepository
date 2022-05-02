package com.defaultstaticmethod;

public interface A {
	void m1();
	default void m2() {
		System.out.println("Default Method2.....");
	}
	

}
