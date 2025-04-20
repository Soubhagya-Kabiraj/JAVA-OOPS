package THREAD;

class Accounts {
	double balance = 15000.00;
	public void debit(double amount) {
		for(int i = 1; i <= 50; i++) {
			try {
				System.out.println("DEBIT : "+i);
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		synchronized (this) {
			this.balance = this.balance - amount;
			System.out.println("AFTER DEBIT BALANCE : "+this.balance);
		}
		
	}
	public synchronized void credit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("AFTER CREDIT BALANCE : "+this.balance);
	}
	
}
class Customers1 extends Thread {
	Accounts acc;
	public Customers1(Accounts acc) {
		this.acc = acc;
	}
	public void run() {
		acc.debit(9000.00);
	}
}
class Customers2 extends Thread {
	Accounts acc;
	public Customers2(Accounts acc) {
		this.acc = acc;
	}
	public void run() {
		acc.debit(7000.00);
	}
}
class Customers3 extends Thread {
	Accounts acc;
	public Customers3(Accounts acc) {
		this.acc = acc;
	}
	public void run() {
		acc.credit(5000.00);
	}
}
public class SynchronizedBlock {

	public static void main(String[] args) {
		Accounts ac = new Accounts();
		Customers1 c1 = new Customers1(ac);
		Customers2 c2 = new Customers2(ac);
		Customers3 c3 = new Customers3(ac);
		c1.start();
		c2.start();
		c3.start();
	}

}
