package com.primenumber;

import java.util.Scanner;

public class PrimeNumber {
	
	public void getPrime(int num) {
		
		for (int i=2;i<=num;i++) {
			boolean b=false;
			for (int j=2;j<=i/2;j++) {
				if(i%j==0) {
					b=true;
					break;
					
				}
			}
			if(b==false) {
				System.out.print(" "+i);
			}
		}
	}
	
public static void main(String []args) {
	System.out.println("Enter any number..");
	Scanner scanner = new Scanner (System.in);
	int number =scanner.nextInt();
	PrimeNumber primenumber= new PrimeNumber();
	primenumber.getPrime(number);
}
}
