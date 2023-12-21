package github;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {
public static void main(String[] args) {
	// Creating non synchronized ArrayList object
	List arr=new ArrayList();
	// Adding elements to list
	arr.add("mango");
	arr.add(20);
	arr.add("viky");
	arr.add('v');
	// Print all elements
	System.out.println(arr);
	 // Synchronizing ArrayList in Java  
	arr=Collections.synchronizedList(arr);
	// you must use synchronized block while iterating over synchronizedList
	 synchronized (arr) {  
         Iterator itr = arr.iterator();  
         while (itr.hasNext()) {  
             System.out.println(itr.next());  
         }  
}
}
}
