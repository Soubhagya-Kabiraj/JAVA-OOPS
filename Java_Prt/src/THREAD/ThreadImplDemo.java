package THREAD;

class FstThread implements Runnable {

	public void run() {
		try {
			for(int i = 0;i <= 10; i++) {
				System.out.println("THREAD 1 "+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
	}
	
}
class ScndThread implements Runnable {

	public void run() {
		try {
			for(int i = 11;i <= 15; i++) {
				System.out.println("THREAD 2 "+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
	}
	
}
public class ThreadImplDemo {

	public static void main(String[] args) {
//		FstThread ft = new FstThread();
//		ScndThread st = new ScndThread();
		
		Thread th1 = new Thread(new FstThread());
		Thread th2 = new Thread(new ScndThread());
		th1.start();
		th2.start();
		try {
			for(int i = 16 ; i <= 25; i++) {
				System.out.println("MAIN "+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
