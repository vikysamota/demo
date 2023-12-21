package github;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList <Integer> list=new LinkedList<Integer>();
		//System.out.println(list.remove());
		list.addFirst(50);
		list.add(78);
		list.add(56);
		list.add(89);
		list.addLast(40);
		System.out.println(list);
		System.out.println(list.set(0, 100));
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.removeLast());
		System.out.println(list);

	}

}
