package EXCEPTION;

class Stock {
	int qoh = 50;
	public void issue(int req) throws OutOfStockExceptionDemmo {
		if(req > qoh) {
			OutOfStockExceptionDemmo oe = new OutOfStockExceptionDemmo();
			throw oe;
		}
		else {
			System.out.println("STOCK : "+(this.qoh-req));
		}
	}
}
public class UserDefinedExceptionDemo {

	public static void main(String[] args) throws OutOfStockExceptionDemmo {
		Stock st = new Stock();
		st.issue(25);
	}

}
