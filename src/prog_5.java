import java.util.Arrays;
import java.util.Comparator;

class student implements Comparator<Integer>
{
	public int compare(Integer x,Integer y)
	{
		return x.compareTo(y);
	}
}

public class prog_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []arr= {2,7,5,3};
		student s1=new student();
		Arrays.sort(arr);
		
		for(Integer a:arr)
		{
			System.out.println(a);
			
		}
	}

}
