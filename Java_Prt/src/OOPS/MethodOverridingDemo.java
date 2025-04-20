package OOPS;

class Parent6 {
	public void show() {
		System.out.println("I am in parent class");
	}
}

class Child6 extends Parent6 {
	public void show() {
		System.out.println("I am in child class");
		super.show();
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child6 ch = new Child6();
		ch.show();
	}

}
