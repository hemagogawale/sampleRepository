package com.reversearray;

import java.util.Arrays;

public class ReverseArray {
	public int[] reverseArray() {
		int arr[]= {10,20,1,2,8,5,6};
		int n= arr.length;
		int temp;
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
				
		}
	
return arr;
	
	}
	public static void main(String[] args) {
		ReverseArray arr = new ReverseArray();
		int a []=arr.reverseArray();
		System.out.println(Arrays.toString(a));
		
	}

}
