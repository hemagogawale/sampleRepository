package anagramstring;

public class Parent {
	
	public void m1(Integer n) {
		System.out.println("Integer");
	}

	public static void main(String[] args) {
		Parent p =new Parent();
		p.m1(10);
	}
}
