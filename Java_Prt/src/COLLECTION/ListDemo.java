package COLLECTION;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
//		ArrayList arr = new ArrayList(); //NOT SYNCHRONIZED
		Vector arr = new Vector();
		// VARIABLE CONVERT INTO OBJECT IS CALLED AUTOBOXING
		arr.add(10);
		arr.add(10.14);
		arr.add("SK");
		arr.add(20);
		System.out.println(arr);
		arr.add(2, 91.73452);
		System.out.println(arr);
		arr.remove(1);
		arr.add(1);
		System.out.println(arr);
//		Collections.sort(arr); //SORT IS POSSIBLE WHEN SAME TYPE OF DATA PRESENT.
		System.out.println(arr);
		for (Object A : arr) {
			System.out.println(A);
		}
		System.out.println("WITH ITERATOR");
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
