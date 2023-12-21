package github;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SynchronizedHashSet {
public static void main(String[] args) {
	// Creating non synchronized HashSet object
	Set s=new HashSet();
	// Adding elements to set
	s.add("mango");
	s.add(20);
	s.add("viky");
	s.add('v');
	// Getting synchronized set
	s=Collections.synchronizedSet(s);
	// you must use synchronized block while iterating over synchronizedSet
	synchronized (s){
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	Set st=new TreeSet();
	st.add(45);
	st.add(20);
	System.out.println(st);

	
	
}
}
