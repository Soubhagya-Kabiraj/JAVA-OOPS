package THREAD;

class Stock {
	int qoh = 50;
	public synchronized void  demand(int req)  {
		try {
			if(req > qoh) {
				this.wait();
			}
			System.out.println("CURRENT STOCK : "+(this.qoh-req));
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void supply(int d) {
		this.qoh = this.qoh + d;
		System.out.println("AFTER SUPPLY : "+this.qoh);
		this.notify();
	}
}

class Producer extends Thread {
	Stock stock;
	int supplyQty;

	public Producer(Stock stock, int supplyQty) {
		this.stock = stock;
		this.supplyQty = supplyQty;
	}

	public void run() {
		try {
			Thread.sleep(1000); // Delay to ensure consumer waits
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stock.supply(supplyQty);
	}
}
class Consumer extends Thread {
	Stock stock;
	int req;

	public Consumer(Stock stock, int req) {
		this.stock = stock;
		this.req = req;
	}

	public void run() {
		stock.demand(req);
	}
}
public class ConsumerProducerProblem {

	public static void main(String[] args) {
		
		Stock s = new Stock();
		Consumer c = new Consumer(s,75);
		Producer p = new Producer(s,50);
		c.start();
		p.start();
	}

}
