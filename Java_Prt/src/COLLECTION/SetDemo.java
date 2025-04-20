package COLLECTION;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       HashSet<String> hs=new HashSet<>();
	TreeSet<String> hs =new TreeSet<String>();
       hs.add("rudra");
       hs.add("tatai");
       hs.add("nil");
       hs.add("rudranil");
      for(Object o:hs)
      {
    	  System.out.println(o);
      }
       
	}

}
