package OOPS;

class Outer {
	public int x = 25;
	class Inner {
		public int y = 30;
		public void add() {
			System.out.println(x+y);
		}
	}
}

public class OuterInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.add();
	}

}
