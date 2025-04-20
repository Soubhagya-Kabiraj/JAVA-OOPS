package OOPS;
class Parent {
	public int x = 25;
}
class Child extends Parent {
	public int y = 20;
	public void add() {
		int z;
		z=x+y;
		System.out.println("REsult "+z);
	}
}
public class SingleInheritenceDemo {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.add();
	}

}
