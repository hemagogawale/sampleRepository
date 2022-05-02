package com.factorydesignpattern;

import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {
		System.out.println("Enter the shape name");
		Scanner scanner = new Scanner(System.in);
		String input=scanner.nextLine();
		
		Shape shape=ShapeFactory.creatShape(input);
		String result=shape.getShape();
		
		System.out.println(result);
	}

}
