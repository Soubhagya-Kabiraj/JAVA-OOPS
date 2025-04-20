package OOPS;
//1. If we declare variable is final we can't chage it
//2. If we declare method is final it can't be overriding
//3.If we declare class is final we can't extend it.
final class Parent12 {
	final int  x = 25;
//	public void modify() {
//		int x = 65;
//	}
	public void show() {
		
		System.out.println("I am in parent class");
	}
}
//class Child12 extends Parent12 {
//	public void show() {
//		System.out.println("Child class");
//	}
//}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
