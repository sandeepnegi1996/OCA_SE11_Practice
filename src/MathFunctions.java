import java.util.ArrayList;
import java.util.List;

public class MathFunctions {
	public static void addToint(int x,int amounttoAdd)
	{
		x=x+amounttoAdd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=10;
		//MathFunctions.addToint(a,b);
		//System.out.println(a);
		int []arr= {6,9,8};
		List<Integer> list=new ArrayList<>();
		list.add(arr[0]);
		list.add(arr[2]);
		list.set(1,arr[1]);
		list.remove(0);
		System.out.println(list);
	}

}
