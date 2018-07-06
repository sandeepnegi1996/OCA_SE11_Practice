class A
{
	public void speed()
	{
		System.out.println(10);
	}
}
class B extends A
{
	public void speed()
	{
		System.out.println(20);
	}
}


public class check_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A a=new B();
		a.speed();
		B b=new B();
		b.speed();
		*/
		A a=new A();
		Object o=(Object)a;  //this type cast  is valid since object class is parent class of all the classes
		
		B b=new B();
		A a1=(A)b;  //this type cast is possible since A is the parent of the B
		
		String s=(String)b;  //this will throw a exception classCastException
		
		B b1=(B)a;      //we can also typecase to the child it won't throw an error
		//===============================================================================
		//this is different concept
		
		//=============================================================================
		
		B b3=new B();
		B b4=(A)b3;  //this will give a error
	}

}
