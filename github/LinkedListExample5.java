package github;

import java.util.LinkedList;

public class LinkedListExample5 {

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
		// Removing all elements of linkedList
		l2.clear();
		// Printing the elements of LinkedList
		System.out.println(l2); // output []

	}

}
