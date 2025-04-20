package OOPS;
class Customer {
	private String id = "C1"; //Instance variable
	private String name = "Soubhagya";
	private String ph = "7679020737";
	public void display() {
		System.out.println("ID is "+id);
		System.out.println("Name is "+name);
		System.out.println("Ph no is "+ph);
	}
}

public class EncapsulationDemo1 {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.display();
	}
}
