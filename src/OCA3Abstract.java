interface hasTail
{
	int getTail();
	
}
abstract class Puma implements hasTail
{
	protected int getTail()   //we Cannot reduce the visibility
	{
		return 4;
	}
}



public class OCA3Abstract  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
