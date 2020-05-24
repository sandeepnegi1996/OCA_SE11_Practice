
class Super
{
	private int a;
	protected Super(int a)
	{
		this.a=a;
		System.out.println(a);
	}
}


public class Super_Class extends Super {

	Super_Class()
	{
		this(5);
	}
	
	Super_Class(int a)
	{
		super(a);
	}
	
	public static void main(String[] args) {
	new Super_Class();
	}

}
