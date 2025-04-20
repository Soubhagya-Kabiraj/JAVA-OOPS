package THREAD;
class FirstThreads extends Thread {
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
class SecondThreads extends Thread {
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
public class RunDemo {

	public static void main(String[] args) {
		
		FirstThreads ft = new FirstThreads();
		SecondThreads sd = new SecondThreads();
		ft.run();
		sd.run();
	}
}
