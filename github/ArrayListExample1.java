package github;

import java.util.ArrayList;

public class ArrayListExample1 {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(0,20);
	list.add(0,30);
	ArrayList<Integer> list1=new ArrayList<Integer>();
	list1.addAll(list);
	System.out.println(list1.get(0));
	System.out.println(list1.get(1));
	System.out.println(list1.get(2));
	//its throws arrayindexoutofboundexception
	//System.out.println(list1.get(3));
	System.out.println(list1.indexOf(10));
}
}
