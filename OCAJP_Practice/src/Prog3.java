
class alpha
{
	String getType()
	{
		return "alpha";
	}
}


class beta extends alpha
{
	String getType()
	{
		return "beta";
	}
}

class gamma extends beta
{
	String getType()
	{
		return "gamma";
	}
}


public class Prog3 {
		public static void main(String []args)
		{
			gamma m1= new alpha();
			gamma m2= new beta();
			System.out.println(m1.getType()+"  "+ m2.getType());
		}
}
