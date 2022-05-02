package Print0to100;

public class Print0to100 {
	
	public static void getNumber(int n) {
		
		if(n<=100) {
		System.out.println(n);
		n++;
		getNumber(n);
	}
	}
		public static void main(String args[]) {
			int a=1;
			getNumber(a);
			
		}

}
