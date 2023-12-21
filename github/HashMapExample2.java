package github;

import java.util.LinkedHashMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		LinkedHashMap<String,String> Colors_map=new LinkedHashMap<String,String>();
		Colors_map.put("one","Red");
		Colors_map.put("two","green");
		Colors_map.put("Three","Blue");
		System.out.println("original linkedhashmap"+Colors_map);
		System.out.println("linkedhashmap Colors_map is empty?"+Colors_map.isEmpty());
		System.out.println("size of the map"+Colors_map.size());
		System.out.println("value of key one="+Colors_map.get("one"));
		System.out.println("Colors_map Contains key 2="+Colors_map.containsKey("two"));
		System.out.println("Colors_map Contains value voilet="+Colors_map.containsValue("voilet"));
		System.out.println("Delete key one="+Colors_map.remove("one"));
		System.out.println("Replace value of key two ="+Colors_map.replace("two","White"));
		System.out.println("updated linkedhashmap"+Colors_map);
	}

}