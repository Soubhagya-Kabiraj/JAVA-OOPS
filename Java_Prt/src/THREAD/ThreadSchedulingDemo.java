package THREAD;

class FThread extends Thread {
	public void run()  {
		
			for(int i = 1; i <= 10; i++) {
				System.out.println("THREAD 1 : "+i);
				
			}
		
	}
}
class SThread extends Thread {
	public void run()  {
		
			for(int i = 11; i <= 20; i++) {
				System.out.println("THREAD 2 : "+i);
				
		
			}
	}
}
public class ThreadSchedulingDemo {

	public static void main(String[] args){
		FThread ft = new FThread();
		SThread st = new SThread();
		ft.setPriority(10);
		st.setPriority(1);
		ft.start();
		st.start();

	}

}
