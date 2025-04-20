package OOPS;

class Teststatic {
	public static int x =25;
	public static int y = 0;
	public static void show() {
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
	}
	static { // Static Block Priority High
		y=x*4;
	}
}
public class StaticBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teststatic.show();
	}
	
}
