package anagramstring;

import java.util.Arrays;

public class AnagramString {
	
	public static void anagramString() {
		 
		String str= "hema";
		String str1= "aemm";
		
		char str3[]=str.toCharArray();
		char str4[]=str1.toCharArray();
		Arrays.sort(str3);
		Arrays.sort(str4);
		
		if(Arrays.equals(str3, str4)) {
			System.out.println("String are anagram..");
		}else 
		{
			System.out.println("String are not anagram..");
		}
	}
	
	public static void main(String[] args) {
		anagramString();
		
	}

}
