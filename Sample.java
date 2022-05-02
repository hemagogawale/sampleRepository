
public class Sample {
public static void main(String[] args) {
	 int a[] = {20,12,15,14,2,16};
	 
	 int min = Integer.MAX_VALUE;
	 int max =Integer.MIN_VALUE;
	 int avg;
	 
	 for(int i=0;i<a.length;i++) {
		 
		    if(a[i]<min) {
			 min=a[i];
		     }
		     else if(a[i]>max) {
			 
			  max=a[i];
			 
		 }
		 
	 }
	 avg = (max+min)/2;
	 
	 System.out.println("The maximum number is.."+max);
	 System.out.println("The minimum number is.."+min);
	 System.out.println("The avarage  is.."+avg);
}
	

}
