package github;

import java.util.HashSet;

public class StudentInfo {
	int id;
	String name,address;
	public StudentInfo(int id, String name, String address) {
		this.id = id;  
	    this.name = name;  
	    this.address=address;
	}
public static void main(String[] args) {
	HashSet<StudentInfo> hs=new HashSet<StudentInfo>();
	StudentInfo s1=new StudentInfo(1,"vikas","phq jaipur");
	StudentInfo s2=new StudentInfo(1,"sanjay","phq jaipur");
	StudentInfo s3=new StudentInfo(3,"rahul","phq jaipur");
	hs.add(s1);
	hs.add(s2);
	hs.add(s3);
	for(StudentInfo si:hs) {
		System.out.println(si.id+" "+si.name+" "+si.address);
	}
}
}
