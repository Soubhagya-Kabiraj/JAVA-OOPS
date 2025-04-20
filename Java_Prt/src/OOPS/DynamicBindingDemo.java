package OOPS;

abstract class Shape1 {
	public abstract  void area(double r);

}

class Square1 extends Shape1{
	public void area(double r) {
		System.out.println("Area "+r*r);
	}
}

class Circle1 extends Shape1 {
	public void area(double r) {
		System.out.println("Area is "+Math.PI*r*r);
	}
}

public class DynamicBindingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape1 s1; // Object Reference
		Shape1 s2;
		Square1 sq = new Square1();
		Circle1 cr = new  Circle1();
		s1=sq;
		s2=cr;
		s1=s2; // Dynamic Binding decides at the runtime which objects which method to be called
		s1.area(5.0);
	}

}
