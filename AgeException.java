import java.util.Scanner;

public class AgeException extends RuntimeException{
	public AgeException(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		System.out.println("Enter the Age");
		Scanner scanner = new Scanner(System.in);
		 int age =scanner.nextInt();
		
		
	 if(age<18) {
		
			throw new AgeException("age below 18 cant Vote..");
		
		
	 }else {
		 System.out.println("Vote Successful....");   //  sysout
	 }
	}
}
