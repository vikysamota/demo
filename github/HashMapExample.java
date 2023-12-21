package github;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
public static void main(String[] args) {
	HashMap hs=new HashMap();
	hs.put(1,"viky");
	hs.put(2," hs");
	hs.put(null,"sanju");
	hs.put(null,null);
	hs.put(null," hs");
	hs.put(2,4);
	System.out.println(hs);
	System.out.println("---------------------");
	Set s=hs.entrySet();
	Iterator itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("---------------------");
	hs.forEach((Key1, value1)->System.out.println("key-->"+Key1+""+"="+value1));
	System.out.println("---------------------");
	for(Object s1:s) {
		System.out.println(s1);
	}
}
}
