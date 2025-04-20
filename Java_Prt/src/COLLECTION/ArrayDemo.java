package COLLECTION;

import java.util.stream.Stream;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[3];
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		System.out.println(x[0]);
		String[] S = {"SK","AJAY","RAM"};
		System.out.println("USING FOR LOOP");
		for(int i = 0; i < S.length; i++) { //FOR LOOP
			System.out.println(S[i]);
		}
		System.out.println("FOR EACH LOOP");
		for (String A : S) { // FOR EACH LOOP
			System.out.println(A);
		}
		System.out.println("USING STREAM API");
		Stream.of(S).forEach(System.out::println);
	}

}
