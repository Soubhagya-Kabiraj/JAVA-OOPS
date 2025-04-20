package EXCEPTION;

class TestException {
	public int x = 20;
	public int y = 0;
	public void test() {
		try {
			System.out.println("X :"+x); // 1
			int z = x / y;
			System.out.println("Z: "+z); // 2
			System.out.println("INSIDE TRY"); // 3
			
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace(); // 4
		}
		System.out.println("OUTSIDE TRY"); // 5
	}
}
public class FlowOfException {

	public static void main(String[] args) {
		TestException te = new TestException();
		te.test();

	}

}
