package com.factorydesignpattern;

public class ShapeFactory {
	
	public static Shape creatShape(String input) {
	
		if(input.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		else if(input.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
	}
     return null;
}
}