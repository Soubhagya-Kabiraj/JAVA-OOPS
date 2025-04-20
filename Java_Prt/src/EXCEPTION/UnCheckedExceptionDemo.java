package EXCEPTION;

class Calculator {
	int x = 25;
	int y = 5;
	public void result() {
		try {
			int z;
			z = x / y; // Calle Environment
			System.out.println("REsult :"+z);
		}
		catch(ArithmeticException ae) {
//			ae.printStackTrace(); // Exception Handling it comes lot of thing. 1. exception name with package name,2. exception message. 3 . line number
//			System.out.println(ae); // in this it show only 1. exception name and 2. message and don't show the line number
			System.out.println(ae.getMessage()); // it shows the only the message
		}
		catch(Exception ex) {
//			ex.printStackTrace();
//			System.out.println(ex);
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Always executed");
		}
	}
	public void show() {
		System.out.println("X : "+x);
	}
}
public class UnCheckedExceptionDemo {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.result(); // In main method if we call caller enviornment
		c.show();
	}

}
