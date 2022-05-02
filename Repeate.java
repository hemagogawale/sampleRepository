
public class Repeate {
	
	public static void main(String[] args) {
		
		String str = "aaaagss";
		
		String st[]=str.split("");

		for(String i: st) {
				
			
				if(str.indexOf(i)==str.lastIndexOf(i)) {
					System.out.print(i);
					
					
				}
				
			
			}
		}
		
	}


