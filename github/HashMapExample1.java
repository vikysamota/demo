package github;

import java.util.HashMap;

public class HashMapExample1 {
public static void main(String[] args) {
	HashMap map=new HashMap();
	map.put(1,"viky");
	map.put(2,"Sanju");
	HashMap hs=new HashMap();
	hs.put(3,"viky");
	hs.put(4," hs");
	hs.put(null,"sanju");
	map.putAll(hs);
	System.out.println(map);
	map.compute(3,(Key1,Value1)->Key1+"samota"+Value1+"samota");
	System.out.println(map);
}
}
