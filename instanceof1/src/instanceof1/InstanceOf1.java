package instanceof1;
class parent{
}

public class InstanceOf1 extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent p1=new parent();
System.out.println(p1 instanceof parent);
InstanceOf1 io=new InstanceOf1();
parent p2=new InstanceOf1();
	}

}
