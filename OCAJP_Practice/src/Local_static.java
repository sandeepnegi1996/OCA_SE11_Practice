
public class Local_static {

	public static int go()
	{
		static int x=30;   //local static variables are not allowed in java 
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(go());
	}

}
