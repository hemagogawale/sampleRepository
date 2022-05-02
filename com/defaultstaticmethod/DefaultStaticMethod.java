package com.defaultstaticmethod;

public interface DefaultStaticMethod {
	
	void m1();
	default void m3() {
		System.out.println("Default Method");
	}
	

}
