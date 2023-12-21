package github;

public class PrinterExample {
int priority;
String name;
public void setter(int priority,String name) {
	this.priority=priority;
	this.name=name;
}
public int getPriority() {
	return priority;
}

public String getName() {
	return name;
}
	public String toString() {
		return "PrinterExample [priority=" + priority + ", name=" + name + "]";
	}
public static void main(String[] args) {
	
}

}
