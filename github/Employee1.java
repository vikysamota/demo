package github;

import java.util.ArrayList;

public class Employee1 {
	private int id;
	private String name;
	public void setNumber(int empid) {
		this.id=empid;
	}
	 public int getNumber() { return id; }
	 public void setName(String empName) {
		 this.name=empName;
	 }
	 public String getName() {return name;}
	 
@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}
public static void main(String[] args) {
	Employee1 e=new Employee1();
	Employee1 e1=new Employee1();
	e.setNumber(1);
	e.setName("vikas");
	e1.setNumber(2);
	e1.setName("sanjay");
	ArrayList list=new ArrayList();
	list.add(e);
	list.add(e1);
	System.out.println(list.toString());
	System.out.println("------------------------");
	list.forEach(System.out::println);
}
}
