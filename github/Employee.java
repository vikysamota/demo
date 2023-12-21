package github;

import java.util.ArrayList;

public class Employee {
	private int id;
	private String name;
	private Employee(int empId, String empName) {
		id=empId;
		name=empName;
	}
	void Display() {
		System.out.println();
	}
	
	
	
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
public static void main(String[] args) {
	Employee e=new Employee(1,"vikas");
	Employee e1=new Employee(2,"sanjay");
	ArrayList list=new ArrayList();
	list.add(e);
	list.add(e1);
	System.out.println(list.toString());
	System.out.println(list);
}
}
