package github;

import java.util.Vector;

public class VectorExample1 {
	public static void main(String[] args) {
		Vector<String> animal = new Vector<String>();
		animal.add("dog");
		animal.add("cat");
		animal.add(0, "lion");
		System.out.println("animals name:" + animal);
		System.out.println(animal.remove("cat"));
		System.out.println("animals name:" + animal);
	}
}
