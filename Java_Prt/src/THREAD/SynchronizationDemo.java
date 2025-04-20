package THREAD;

class Account {
	double balance = 15000.00;
	public synchronized void debit(double amount) {
		for(int i = 1; i <= 50; i++) {
			try {
				System.out.println("DEBIT : "+i);
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.balance = this.balance - amount;
		System.out.println("AFTER DEBIT BALANCE : "+this.balance);
	}
	public synchronized void credit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("AFTER CREDIT BALANCE : "+this.balance);
	}
	
}
class Customer1 extends Thread {
	Account acc;
	public Customer1(Account acc) {
		this.acc = acc;
	}
	public void run() {
		acc.debit(9000.00);
	}
}
class Customer2 extends Thread {
	Account acc;
	public Customer2(Account acc) {
		this.acc = acc;
	}
	public void run() {
		acc.debit(7000.00);
	}
}
class Customer3 extends Thread {
	Account acc;
	public Customer3(Account acc) {
		this.acc = acc;
	}
	public void run() {
		acc.credit(5000.00);
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		Account ac = new Account();
		Customer1 c1 = new Customer1(ac);
		Customer2 c2 = new Customer2(ac);
		Customer3 c3 = new Customer3(ac);
		c1.start();
		c2.start();
		c3.start();
	}

}
