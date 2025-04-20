package OOPS;

class Patient {
	public String id;
	public String name;
	public int age;
	public Patient(String id,String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void detail() {
		System.out.println("ID : "+id);
		System.out.println("NAme : "+ name);
		System.out.println("Age : "+age);
	}
}

class LabTest extends Patient {
	public String tname ;
	public String tdt;
	public double price;
	public LabTest(String id,String name,int age,String tname, String tdt, double price) {
		super(id,name,age);
		this.tname = tname;
		this.tdt = tdt;
		this.price = price;
	}
	public void testDetail() {
		System.out.println("Test done :"+tname);
		System.out.println("TEst date :"+tdt);
		System.out.println("Test price :"+price);
	}
}

public class SuperConstructorDemo {

	public static void main(String[] args) {
		LabTest lt=new LabTest("PT1", "Ashoke", 50, "X-Ray", "17042025", 1000.00);
		lt.detail();
		lt.testDetail();

	}

}
