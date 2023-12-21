package github;

import java.util.ArrayList;

public class ArrayListRemoveDuplicates {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(1);
	list.add(3);
	list.add(3);
	list.add(3);
	list.add(3);

	list.add(4);
	list.add(2);
	list.add(5);
	list.add(6);
	list.add(3);
	System.out.println("before removeing duplicates");
	list.forEach(System.out::println);
	for(int i=0;i<list.size();i++) {
		for(int j=i+1;j<list.size();j++) {
			if(list.get(i)==list.get(j)) {
				list.remove(j);
			}
		}
	}
	System.out.println("after removeing duplicates");
	list.forEach(System.out::println);
	
	System.out.println(list);
	}
}
