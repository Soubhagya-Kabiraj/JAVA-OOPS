package THREAD;

class TestThread extends Thread {
	public void run() {
		try {
			for(int i = 400; i <= 550; i++) {
				System.out.println("TEST THREAD "+ i);
				Thread.sleep(100);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class DaemonThreadDemo { // DAEMONN THREAD IS LOW PRIORITY THREAD. 
	//MAIN DOES NOT WAIT FOR DAEMON THREAD TO FINISH. DAEMON IS RUNNING IN OS BACKGROUND

	public static void main(String[] args) {
		TestThread tt = new TestThread();
		tt.setDaemon(true);
		tt.start();
		try {
			for(int i = 1 ; i <= 50; i++) {
				System.out.println("MAIN "+i);
				Thread.sleep(100);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
