package github;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(10);
	list.add(null);
	list.add(null);
	//how to print the list values 
	//(1)
	System.out.println("----------------------");
	System.out.println(list);
	//(2)
	System.out.println("----------------------");
	for(Integer i:list) {
		System.out.println(i);
	}
		//(3)
		System.out.println("----------------------");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();	
			System.out.println(i);}
		//4
		System.out.println("----------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//5
		System.out.println("----------------------");
		list.forEach(System.out::println);
		//6
		System.out.println("----------------------");
		list.stream().forEach(System.out::println);		
}

}
