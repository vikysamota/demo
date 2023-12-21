package github;

import java.util.ArrayList;

public class ArrayListExample3 {
	public static void main(String[] args) {
		
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(770);
	list.add(770);
	list.add(770);
	ArrayList<Integer> list1=new ArrayList<Integer>();
	list1.add(30);
	list1.add(770);
	list1.add(777);
	list1.add(50);
	list1.addAll(list);
	System.out.println(list1);
	list1.removeAll(list);
	System.out.println(list1);
}
}
