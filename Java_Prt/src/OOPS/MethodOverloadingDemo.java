package OOPS;

class Calculator {
	public int add(int a,int b) { // Method overloading, same method with different argument
		return (a+b);
	}
	public float add(int a, float b) {
		return (a+b);
	}
	public double add(double a, double b) {
		return (a+b);
	}
	
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		Calculator cl = new Calculator();
		System.out.println(cl.add(5, 6));
		System.out.println(cl.add(5, 6.5));
		System.out.println(cl.add(5.5, 6.6));
	}

}
