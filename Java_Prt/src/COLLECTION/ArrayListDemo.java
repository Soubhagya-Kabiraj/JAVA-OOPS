package COLLECTION;

import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>() ;
		arr.add(10);
		arr.add(20);
		System.out.println(arr);
		arr.add((int) 10.67);
//		arr.add("SK"); // WE CAN'T ADD STRING HERE BECAUSE IT IS INTEGER TYPE ARRAYLIST
		System.out.println(arr);
	}

}
