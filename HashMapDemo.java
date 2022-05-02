import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, Student>map =new HashMap<>();
		Student s1=new Student("Aniket");
		Student s2=new Student("Sumit");
		map.put(1, s1);
		//s1.setName("sumit");
		s1=s2;
		System.out.println(map.get(1));
	}

}
