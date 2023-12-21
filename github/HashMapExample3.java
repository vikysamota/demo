package github;

import java.util.HashMap;
import java.util.Set;

class StudentData{
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
	if(this.hashCode()==obj.hashCode()) {
		return true;
	}
	 return false;
		
	}
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	int id,age;
	String name;
	public StudentData(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	
}
public class HashMapExample3 {
public static void main(String[] args) {
	StudentData s=new StudentData(1,26,"vikas");
	StudentData s3=new StudentData(1,26,"vikas");
	StudentData s1=new StudentData(2,25,"sanju");
//	HashMap<Integer,StudentData> map=new HashMap<Integer,StudentData>();
//	map.put(1,s);
//	map.put(2,s1);
//	map.put(3,s3);
//	Set set1=map.entrySet();
//	for(Object ss:set1) {
//		System.out.println(ss);
//}
	HashMap<StudentData,Integer> map=new HashMap<StudentData,Integer>();
	map.put(s,1);
	map.put(s1,2);
	map.put(s3,3);
	Set set1=map.entrySet();
	for(Object ss:set1) {
		System.out.println(ss);
}
	}
}

