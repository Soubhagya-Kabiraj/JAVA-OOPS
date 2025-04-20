package OOPS;

abstract class Shape {
	public abstract  void area(double r);

}

class Square extends Shape{
	public void area(double r) {
		System.out.println("Area "+r*r);
	}
}

class Circle extends Shape {
	public void area(double r) {
		System.out.println("Area is "+Math.PI*r*r);
	}
}

public class AbstractionDemo {
	
	public static void main(String[] args) {
		Square sq = new Square();
		sq.area(5.0);
		Circle cr = new Circle();
		cr.area(5.0);
	}

}
