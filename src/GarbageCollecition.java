
public class GarbageCollecition {
private String name;
public GarbageCollecition(String n)
{
	name=n;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GarbageCollecition gc1=new GarbageCollecition("g1");
		GarbageCollecition gc2=new GarbageCollecition("g2");
		gc1=gc2;
		gc2=null;
		gc1=null;
	}

}
