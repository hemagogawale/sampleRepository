package com.minmax.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayMinMax {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,25,17,2,18};
		
	
		
		int min = Integer.MAX_VALUE;
		int max =Integer.MIN_VALUE;
		int sum=0;
		
		for(int num=0; num<arr.length;num++) {
			sum = sum+arr[num];
			
			if(arr[num]>max) {
				max=arr[num];
			}
			 if (arr[num]<min){
				min =arr[num];
				
			}
		}
		int avg = sum/arr.length;
		
	System.out.println(" The max num is .."+ max+ "  min num is.."+min+ "the avarage is ..."+avg);
	
	
	
	}
	

}
