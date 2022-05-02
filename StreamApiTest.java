import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamApiTest {
	
	public static void main(String[] args) {
		String s ="this is my interview ";
		/*String str []=s.split(" ");
		List<String> list = Arrays.asList(str);
	List l=	list.stream().sorted().collect(Collectors.toList());
		System.out.println(l);*/
		
		/*List<Integer> list1 = Arrays.asList(16,7,5,21,1,8,9,100);
		List l2=list1.stream().filter(e->e*e>127).collect(Collectors.toList());
		System.out.println(l2);
		List l4=list1.stream().map(e->e*e).collect(Collectors.toList());
		long l3=list1.stream().filter(e->e*e>127).count();
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);*/
		
	String str1=s.replace(" ", "");
	String str2[]=str1.split("");
	List<String> list = Arrays.asList(str2);
	
	Map <String,Integer>map = new LinkedHashMap<String,Integer>();
	
	for(String st:str2) {
		Integer value=map.get(st);
		if(value==null) {
			map.put(st, 1);
		}else {
			map.put(st, value+1);
		}
		
	}
	
	for(Entry<String, Integer> map1:map.entrySet()) {
		if(map1.getValue()>1) {
			System.out.println("Key :"+map1.getKey()+" Value :"+map1.getValue());
			
		}
	 }
	
	
	}

}
