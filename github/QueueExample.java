package github;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) throws Exception {
		Queue<String> qs = new LinkedList<String>();
		
		// System.out.println(qs.remove()); no such element exception
		//System.out.println(qs.peek()); null
		//System.out.println(qs.poll()); null
		// System.out.println(qs.element()); no such element exception
		System.out.println(qs.add("viky"));
		qs.add("sanju");
		qs.add("viky");
//		if(!qs.isEmpty()) {
//			throw new Exception( "No such case");
//		}
		qs.add(null);
		qs.add(null);
		System.out.println(qs);
		System.out.println(qs.offer("rahul")); // Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
		System.out.println(qs.element());// output head of the queue viky throw exeption if empty
		System.out.println(qs.remove());// output returns and remove the head of the element Throws an exception if the
										// queue is empty.
		System.out.println(qs.peek());// output head of the queue sanju return null if empty
		System.out.println(qs.poll());// output Returns and removes the head of the queue. Returns null if the queue
										// is empty.
	}
}
