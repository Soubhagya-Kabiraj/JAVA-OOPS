package OOPS;

class Student {
	public int roll = 1;
	public String name = "Soubhagya";
	public void show() {
		System.out.println("Roll is "+ roll);
		System.out.println("Name is "+ name);
	}
}
class Exam extends Student {
	public String Sub1 = "Physics";
	public String Sub2 = "Chemistry";
	public String Sub3 = "Math";
	public void display() {
		System.out.println(Sub1);
		System.out.println(Sub2);
		System.out.println(Sub3);
	}
	public int score(int p, int c, int m) {
		return p+c+m;
	}
}
class Sem extends Exam {
	public String sem = "IVth";
	public String year = "2nd";
	public void details() {
		System.out.println("Sem is "+sem);
		System.out.println("Year is "+year);
	}
}
public class MultiILevelnheritenceDemo {
	public static void main(String[] args) {
		Sem s = new Sem();
		s.details();
		s.display();
		System.out.println(s.score(90,93,92));
		s.show();
	}

}
