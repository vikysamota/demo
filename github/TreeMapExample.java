package github;

import java.util.TreeMap;

public class TreeMapExample {
public static void main(String[] args) {
	TreeMap map1=new TreeMap();
	map1.put(1,"viky");
	map1.put(2,"sanju");
	map1.putIfAbsent(3,"rahul");
	System.out.println(map1);
	System.out.println(map1.ceilingKey(2));
	System.out.println(map1.clone());
}
}
