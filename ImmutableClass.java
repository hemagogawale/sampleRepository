//make class final
//make variable private final
//do not provide setter method
//initialize variable through parameterized constructor
public final class ImmutableClass  {
	private final int id;
	private final String name;
	private final String city;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
public String city() {
	return city;
}

public ImmutableClass(int id, String name, String city) {
	this.id=id;
	this.name=name;
	this.city= city;
}

public static void main(String[] args) {
	ImmutableClass immutableclass = new ImmutableClass(1,"krishna","pune");
	
	System.out.println("value of id >>>>"+immutableclass.id);
	System.out.println("value of name >>>>"+immutableclass.name);
	System.out.println("value of city >>>>"+immutableclass.city);
	
	
}
}
