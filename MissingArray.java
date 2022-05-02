import java.util.Arrays;
import java.util.List;

public class MissingArray {
	
	public static void main(String[] args) {
		int a[] = {12,10,13,15,14,16};
		
		int temp;
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(" "+a[i]);	
		}
		
		
		
		for(int k=0; k<a.length;k++) {
			if(a[k]+1!=a[k+1]) {
				System.out.print(" "+(a[k]+1) );
				break;
			}
			
				
				
			
			
		}
	}

}
