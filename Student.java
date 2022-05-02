
public class Student {
	
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

}
