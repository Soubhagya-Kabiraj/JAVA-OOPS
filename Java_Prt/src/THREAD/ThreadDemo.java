package THREAD;

class FirstThread extends Thread {
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
class SecondThread extends Thread {
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
public class ThreadDemo {

	public static void main(String[] args) {
		
		FirstThread ft = new FirstThread(); // READY STAGE
		SecondThread st = new SecondThread(); // READY STAGE
		ft.start();
		st.start();
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
