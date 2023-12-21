package github;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(100);
		tree.add(200);
		tree.add(300);
		tree.add(400);
		tree.add(500);
		tree.add(600);
		System.out.println(tree); //output [100, 200, 300, 400, 500, 600]
		//navigable set methods
		// ceiling(); returns the lowest element among those elements that are greater than or equal to the specified element
		System.out.println(tree.ceiling(300)); //output 300
		System.out.println(tree.ceiling(600)); //output 600
		System.out.println("---------------------------------------");
		//floor() - returns the greatest element among those elements that are less than or equal to the specified element
		System.out.println(tree.floor(300)); //output 300
		System.out.println(tree.floor(100));// output 100
		System.out.println(tree.floor(250));//output 200
		System.out.println("---------------------------------------");
		//higher() - returns the lowest element among those elements that are greater than the specified element
		System.out.println(tree.higher(300)); //output 400
		System.out.println(tree.higher(350)); //output 400
		System.out.println(tree.higher(600)); // output null
		System.out.println("---------------------------------------");
		//lower() - returns the greatest element among those elements that are less than the specified element
		System.out.println(tree.lower(300)); //output 200
		System.out.println(tree.lower(350)); //output 300
		System.out.println(tree.lower(100)); // output null
		System.out.println("---------------------------------------");
		//pollFirst() - returns and removes the first element from the set
		System.out.println(tree.pollFirst()); //output 100
		System.out.println("---------------------------------------");
		//pollLast() - returns and removes the last element from the set
		System.out.println(tree.pollLast()); //output 600
		System.out.println("---------------------------------------");
		//descendingSet() - reverses the order of elements in a set
		System.out.println(tree.descendingSet()); //output 600 500 400 300 200 100
		System.out.println("---------------------------------------");
		//descendingIterator() - returns an iterator that can be used to iterate over a set in reverse order
	
		
		
		
	}

}
