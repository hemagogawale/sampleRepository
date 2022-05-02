import java.util.Scanner;

public class CustomException {

	int balance =50000;
	
	public void withdrawl(int amt) {
		if (amt>balance) {
			throw  new InsufficientBalance("Insufficient Balance in your account");
		}else {
			balance = balance-amt;
			System.out.println("Balance after withdrawl  >>>"+balance);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the withdrawl amt....");
		Scanner scanner = new Scanner(System.in);
		int amt =scanner.nextInt();
		CustomException account = new CustomException();
		account.withdrawl(amt);
	}
}
