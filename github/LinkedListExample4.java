package github;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListExample4 {

	public static void main(String[] args) {
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		// adding the elements to LinkedList
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);
		// Printing the elements of LinkedList
		System.out.println(l2); // output [10, 20, 30, 40, 50]
		// Creating another LinkedList
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		// Cloning the linkedList2 into linkedList3
		l3 = (LinkedList<Integer>) l2.clone();
		//Printing the elements of linkedList3
		System.out.println(l3);// output [10, 20, 30, 40, 50]

	}

}
