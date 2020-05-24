
public class Prog2 {

	public Prog2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []s= {"tom","jerry"};
		for(int i=0;i<3;i++)
		{
			for(String str:s)
			{
				System.out.println(i+" "+str);
				if(i==1)
				{
					break;
				}
			}
		}

	}

}
