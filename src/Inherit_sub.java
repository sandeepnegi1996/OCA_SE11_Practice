class Parent 
{
	int a; //public
	Parent()
	{
		a=10;
	}
}

class Child extends Parent
{
	int b;
	Child()
	{
		b=20;
	}
}


public class Inherit_sub {

	public static void main(String[] args) {
		
		Child c1=new Child();
		System.out.println(c1.b);
		System.out.println(c1.a);
		
		Parent p1=new Child();
		System.out.println(p1.a);
	//	System.out.println(p1.b);
	}

}
