import java.util.Arrays;
import java.util.List;

public class ListIndex {

	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(10,20,30,40,50,60,70);
		for(Integer i:list) {
		
		System.out.println("Element :"+i+"  Index is :"+list.indexOf(i));
		
	}
}
}