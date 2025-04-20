package OOPS;
import java.util.*;
public class ConsoleInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println(age);
	}

}
