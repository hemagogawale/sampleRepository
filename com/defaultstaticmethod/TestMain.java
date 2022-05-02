package com.defaultstaticmethod;

public class TestMain {
	
	public static void main(String[] args) {
		DefaultStaticMethod df= new Sample1();
		df.m1();
		A a= new Sample1();
		a.super.m2();
		Sample1 s= new Sample1();
		s.m1();
	
	}

}
