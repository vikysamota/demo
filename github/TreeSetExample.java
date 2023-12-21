package github;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
public static void main(String[] args) {
	int no = 10;
	System.out.println("+Integer.toString(no)+");
	
	SortedSet set=new TreeSet();
	  set.add("Audi");  
      set.add("BMW");    
      set.add("Baleno");
      set.add("Mercedes");
      System.out.println("The list of elements is given as:");  
      for (Object object : set) {  
          System.out.println(object);  
            }  
      System.out.println("first element:"+set.first());
      System.out.println("last element:"+set.last());
      System.out.println("Headset  element example:"+set.headSet("Audi"));
      System.out.println("tailset  element example:"+set.tailSet("Mercedes"));
      System.out.println("subset  element example:"+set.subSet("Mercedes", "Mercedes"));
      System.out.println("tailset  element example:"+set.comparator());
}
}
