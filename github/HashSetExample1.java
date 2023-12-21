package github;

import java.util.HashSet;

public class HashSetExample1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(25);
		hs.add(26);
		hs.add(27);
		hs.add(28);
		hs.add(29);
		hs.add(30);
		hs.add(15);
		hs.add("viky");
		hs.add(10.0);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.hashCode());
		System.out.println(hs.add(10));// return false if already present in the map
		System.out.println(hs.add("java")); // return true if already not present in the map
	}
}
