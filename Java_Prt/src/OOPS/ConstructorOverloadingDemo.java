package OOPS;

class Cake {
	public Cake() {
		System.out.println("Happy birthday");
	}
	public Cake(String msg,String shape) {
		System.out.println(msg);
		System.out.println(shape);
	}
	public Cake(String msg,String shape, double price) {
		System.out.println(msg);
		System.out.println(shape);
		System.out.println(price);
	}
	
}
public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake c1 = new Cake();
		Cake c2 = new Cake("Happy birthday", "Round");
		Cake c3 = new Cake("Good taste", "Oval", 100.00);

	}

}
