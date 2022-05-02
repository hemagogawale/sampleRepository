package com.sumofalphabets;

import java.util.Arrays;
import java.util.List;

public class SumOfAlphabets {
	
	//public static void getSumOfAlphabets(String str) {
		public static void main(String[] args) {
		String str ="Good Morning";
		String st="";
		for(int i=0;i<str.length();i++) {
		  char ch=str.charAt(i);
		ch=  Character.isUpperCase(ch)?Character.toLowerCase(ch):Character.toUpperCase(ch);
		
		st= st+ch;
		}
		System.out.println(st);
		/*int sum =0;
		String str2="";
		for(int i=0;i<str.length();i++) {
			
			System.out.println(str.charAt(i)+"="+ (str.charAt(i)-'a'+1));
			sum= sum+(str.charAt(i)-'a'+1);
			str2 =str2+str.charAt(i);
		}
	
		System.out.println(str2 +": "+sum);
	}
public static void main(String[] args) {
	String str = "vivek";
	getSumOfAlphabets(str);*/
	
}
}
