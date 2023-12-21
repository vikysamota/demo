package github;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		al2.add(10);
		HashSet hs = new HashSet(al2);
		System.out.println(hs);
		System.out.println(hs.contains(10));
		System.out.println(hs.containsAll(al2));
		System.out.println(hs.remove(20));
		System.out.println(hs.size());
		
	}

}
