package github;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Clg_Student implements Comparator  {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Clg_Student [id=" + id + ", name=" + name + "]";
}
public static void main(String[] args) {
	Comparator c =Comparator.comparing(Clg_Student::getName);
	Clg_Student s1=new Clg_Student();
	s1.setId(1);
	s1.setName("viky");
	Clg_Student s2=new Clg_Student();
	s2.setId(2);
	s2.setName("sanju");
	TreeSet<Clg_Student> ts=new TreeSet<Clg_Student>(c);
	ts.add(s1);
	ts.add(s2);
	ts.forEach(System.out::println);
	LinkedList<String> list = new LinkedList<>();  
	list.add("Java");
	list.add("Python"); 
	list.add("Scala"); 
	System.out.println(list.removeLast());
}

//public int compare(Clg_Student o1, Clg_Student o2) {
//	
//
//	if (o1.getId() == o2.getId())
//		return 0;
//	else if (o1.getId() > o2.getId())
//		return 1;
//	else
//		return -1;
//}
public int compare(Clg_Student o1, Clg_Student o2) {
	if(o1.getId()>o2.getId()) {
		return 1;
	}
	else if(o1.getId()<o2.getId()) {
			return -1;
		
	}
	else
	return 0;
}
@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	return 0;
}



}
