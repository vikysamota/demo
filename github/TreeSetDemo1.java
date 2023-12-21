package github;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 implements Comparator<TreeSetDemo> {

	@Override
	public int compare(TreeSetDemo o1, TreeSetDemo o2) {
		return o1.name.compareTo(o2.name);
	}
public static void main(String[] args) {
	TreeSet<TreeSetDemo> ts=new TreeSet<TreeSetDemo>();
	ts.add(new TreeSetDemo("viky"));
	ts.add(new TreeSetDemo("vikysamota"));
	ts.add(new TreeSetDemo("sanjay"));
	ts.add(new TreeSetDemo("rahulkumar"));
	Collections.sort(ts,new TreeSetDemo1() );
}
}
