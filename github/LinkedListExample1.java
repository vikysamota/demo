package github;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		// adding elements
		l1.add("one");
		l1.add("two");
		l1.add("three");
		// Adding elements at the end of the list
		l1.addLast("four");
		// printing the elements of list
		System.out.println(l1);// output [one, two, three, four]
		// Replacing an element at index 2 with "ZERO"
		l1.set(2, "zero");
		System.out.println(l1);// output [one, two, zero, four]

	}

}
