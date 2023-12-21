package github;

import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedHashsetExample {

	public static void main(String[] args) {
		 LinkedHashSet<String> al=new LinkedHashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  java.util.Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }   
		  al.remove("ravi");
	}

}
