package STRING;

class Employee {
	public String id;
	public String name;
	public String des;
	public Employee (String id, String name, String des) {
		this.id = id;
		this.name = name;
		this.des = des;
	}
	public String toString() {
		return id+"====>"+name+"====>"+des;
	}
}
public class CheckObject {

	public static void main(String[] args) {
		Employee em = new Employee("E1", "SK", "HR");
		System.out.println(em); // IT IS CALLLED HASHCODE
	}

}
