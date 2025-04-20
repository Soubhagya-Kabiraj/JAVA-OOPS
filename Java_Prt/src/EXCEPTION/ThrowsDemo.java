package EXCEPTION;
class Calculators {
	int x = 25;
	int y = 5;
	public void result() throws ArithmeticException,Exception {
	
		int z;
		z = x / y; 
		System.out.println("REsult :"+z);
		
	}
}

public class ThrowsDemo {

	public static void main(String[] args) throws ArithmeticException,Exception{
		Calculators c = new Calculators();
		c.result();
	}

}
