package com.squareofnum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNum {

	public static void main(String[] args) {
		
	
	List<Integer> list = Arrays.asList(2,4,6,8,10);
	System.out.println(list);
	List Square = list.stream().map(number->number*number).collect(Collectors.toList());
	
	System.out.println(Square);
	
}
}