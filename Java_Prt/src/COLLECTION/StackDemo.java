package COLLECTION;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.add(10);
		st.push(20);
		st.add(30);
		st.add(1, 100);
		System.out.println(st);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st);
	}

}
