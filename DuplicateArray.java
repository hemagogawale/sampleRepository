
public class DuplicateArray {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,20,10,30,50,30};
		
		for(int i= 0; i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
				
			}
		}
	}

}
