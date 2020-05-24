
public class VaragsTest {

	public void go(int x,String... y)
	{
		System.out.println(y[y.length-x]+" ");
	}
	public static void main(String[] args) {
		
		new VaragsTest().go(1,"hi");
		new VaragsTest().go(2,"hi","hello");
	}

}
