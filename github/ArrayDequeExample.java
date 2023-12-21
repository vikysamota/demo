package github;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayDequeExample {
public static void main(String[] args) {
	ArrayDeque arrdeque=new ArrayDeque();
	ArrayDeque<String> arr=new ArrayDeque<String>();
	arrdeque.add("viky");
	arrdeque.add("sanju");
	arrdeque.add(20);
	arrdeque.addLast(48);
	arrdeque.addFirst("rahul");
	System.out.println(arrdeque);
	arrdeque.toArray();
	System.out.println(arrdeque);
	System.out.println(arrdeque.spliterator());
	System.out.println(arrdeque.size());
	System.out.println();
	arrdeque.forEach(System.out::println);
	//System.out.println(arrdeque.hashCode());
	System.out.println("---------");
	//System.out.println(arrdeque.spliterator().hashCode());
	
//	Spliterator s = arrdeque.spliterator();
//s.forEachRemaining(name->System.out.println(name));
	ArrayList<Object> list=new ArrayList<Object>();
	list.add("samota");
	list.add("sanjay");
	list.add("viki");
	Object []ob=list.toArray();
	System.out.println(ob.length);
	//System.out.println(ob);
	//Object [] obj = arrdeque.toArray();
	//Object[] obj2 = arrdeque.toArray(obj);
//	arrdeque.addAll(list);
	Object [] obj3 = arrdeque.toArray(ob);
	System.out.println(obj3.length);
//	for(Object o:obj3) {
//		System.out.println(o);
//	}
	
	String text = "helo sanjay samota";
char[] cc =	text.toCharArray();
	arr.add("mama");
	arr.add("dhreej");
	arr.add("mama");
	arr.add("dhreej");
	Object[] a = arr.toArray(ob);
	for(Object o:a) {
		System.out.println(o);
	}
	
}
}
