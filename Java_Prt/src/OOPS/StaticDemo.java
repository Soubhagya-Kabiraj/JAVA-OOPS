package OOPS;

class Usestatic{
	public static int x =25;
	public static void show() {
		System.out.println("X: "+x);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		
		Usestatic.show();
		System.out.println(Usestatic.x);
	}

}
