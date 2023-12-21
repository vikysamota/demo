package github;

import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		LinkedList<String> l2 = new LinkedList<String>();
		// adding elements
		l2.add("JAVA");
		l2.add("J2EE");
		l2.add("JSP");
		l2.add("SERVELETS");
		// Adding elements at the end of the list
		l2.addLast("JDBC");
		// printing the elements of list
		System.out.println(l2);// output [JAVA, J2EE, JSP, SERVELETS, JDBC]
		// Retrieving and removing an element at index 2 of the list
		System.out.println(l2.remove(2));// output JSP
		// Printing the elements of list
		System.out.println(l2); // output [JAVA, J2EE, SERVELETS, JDBC]
		// Only retrieving an element at index 2 of the list
		System.out.println(l2.get(2));// output SERVELETS

	}

}
