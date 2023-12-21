package github;

import java.util.Comparator;

public class AgeComparator extends Student implements Comparator {
	Student student;
	
	AgeComparator(Student student) {
		super(10,"samota",27);
		this.student=student;
		
	}

	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;

	}
	public static void main(String[] args) {
		Student s1 = new Student(11,"samota",27);
		Student s2 = new Student(11,"samota",29);
		AgeComparator ac = new AgeComparator(s1);
		AgeComparator ac1 = new AgeComparator(s2);
		System.out.println();
		
	}
}