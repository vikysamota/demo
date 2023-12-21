package github;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
public static void main(String[] args) {
	Map hs=new LinkedHashMap(16,0.75f,true);
	hs.put(1,"viky");
	hs.put(2," hs");
	hs.put(56,10);
	hs.put(null,"sanju");
	hs.put(3, "java");
	hs.put(99, 10);
	hs.put(78,100);
	System.out.println(hs);
	//System.out.println(removeEldestEntry(Map.Entry<K, V> eldest));
}
}
