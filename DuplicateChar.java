import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateChar {
	
	public static void main(String[] args) {
		String str = "this is my interview";
		String str1=str.replace(" ", "");
		String str2[]=str1.split("");
		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		for(String s:str2) {
			Integer value=map.get(s);
			if(value==null) {
				map.put(s, 1);
			}
			else {
				map.put(s, value+1);
			}
			
		}
		
		for(Entry<String,Integer>newmap:map.entrySet()) {
			if(newmap.getValue()>1) {
				System.out.println(newmap.getKey()+":"+newmap.getValue());
			}
		}
		
	}

}
