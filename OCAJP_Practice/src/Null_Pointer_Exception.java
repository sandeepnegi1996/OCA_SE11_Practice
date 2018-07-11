
public class Null_Pointer_Exception {
	Integer i;   //this will act as a reference variable
	int x;
//	int i;
	public Null_Pointer_Exception(int y)
	{
		x=i+y;
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Null_Pointer_Exception(new Integer(4));
	}

}
