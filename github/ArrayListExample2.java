package github;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(null);
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.remove(new Integer(20)));
		System.out.println(list);
		System.out.println(list.remove((Integer) 10));
		System.out.println(list);

	}

}
