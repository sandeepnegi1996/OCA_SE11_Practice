

class parent
{
	public String type="c";
	parent()
	{
		System.out.println("parent");
	}
}	
public class Prog4 extends parent {

	public Prog4() {
		// TODO Auto-generated constructor stub
		System.out.println("child");
	}
	public void go()
	{
		type ="f";
		System.out.println(type+ " "+ super.type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Prog4().go();
	}

}
