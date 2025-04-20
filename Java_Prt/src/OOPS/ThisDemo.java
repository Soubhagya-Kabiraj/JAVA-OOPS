package OOPS;

class Product {
	public String pid ;
	public String name;
	public int pqty ;
	public double price;
	public String std ;
	public Product(String pid, String name, int pqty, double price ) {
		this.pid = pid;
		this.name = name;
		this.pqty = pqty;
		this.price = price;
		
	}
	public void viewproduct() {
		System.out.println("ID : "+this.pid);
		System.out.println("Name : "+this.name);
		System.out.println("Quantity : "+this.pqty);
		System.out.println("Product price : "+price);
	}
	public void salesorder() {
		this.viewproduct();
		double total = 0.0;
		total = this.price * this.pqty;
		
		this.std = "17042025";
		System.out.println("Date : "+this.std);
		System.out.println("Sales : "+total);
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		Product p = new Product("P1","TV",5,25000.00);
		p.salesorder();
	}

}
