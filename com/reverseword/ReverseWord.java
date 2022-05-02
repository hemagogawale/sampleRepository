package com.reverseword;

public class ReverseWord {
	
	public static void main(String[] args) {
		
		String str="This is my first interview";
		
		String words[]=str.split(" ");
		
		String revstring="";
		
		for(String w:words) {  
			
			String revwords ="";
			for(int i=w.length()-1;i>=0;i--) {
				
				revwords= revwords+w.charAt(i);
					
			}
			revstring =revstring+revwords+" ";
		}
		System.out.println(revstring);
	}

}
