package github;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector v=new Vector();//withoutparameters
		System.out.println(v.capacity());
		Vector v1=new Vector(7);// with initial capacity
		System.out.println("initial capacity:"+v1.capacity());
		v1.add(5);
		v1.add(5);
		v1.add(5);
		v1.add(5);
		v1.add(5);
		v1.add(5);
		v1.add(5);
		v1.add(5);
		System.out.println("after increment:"+v1.capacity());
		Vector v2=new Vector(4,3);//with initial capacity and increment size
		System.out.println("initial capacity:"+v2.capacity());
		v2.add(5);
		v2.add(5);
		v2.add(5);
		v2.add(5);
		v2.add(5);
		System.out.println("after increment:"+v2.capacity());
		Vector v3=new Vector(100);
		v3.add(5);
		v3.add(5);
		v3.add(5);
		v3.add(5);
		v3.add(5);
		v3.trimToSize();
		System.out.println("after trim:"+v3.capacity());
		
		
		
		
		
	}

}
