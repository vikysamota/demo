package github;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetExample {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	ArrayList<String> al=new ArrayList<String>();
	al.add("java");
	al.add("python");
	al.add("java");
	ArrayList<Integer> al2=new ArrayList<Integer>();
	al2.add(10);
	al2.add(20);
	al2.add(10);
	al2.add(30);
	hs.add(al);
	hs.add(al2);
	System.out.println(hs);
	
}
}
