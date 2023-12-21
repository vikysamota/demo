package github;

import java.util.LinkedList;

public class LinkedListExample3 {
public static void main(String[] args) {
	LinkedList<String> l2 = new LinkedList<String>();
	//adding elements
	l2.add("AAA");
	l2.add("BBB");
	l2.add("CCC");
	l2.add("BBB");
	l2.add("FFF");
	l2.add("BBB");
	System.out.println(l2); //output [AAA, BBB, CCC, BBB, FFF, BBB]
	//Getting the position of last occurrence of "BBB"
	System.out.println(l2.lastIndexOf("BBB"));// output 5
}
}
