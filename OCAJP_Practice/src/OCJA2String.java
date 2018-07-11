
public class OCJA2String {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="JAVA";
		String s2="JAVA";
		StringBuilder sb1=new StringBuilder();
		sb1.append("JA").append("VA");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString()==s1);
		System.out.println(sb1.toString().equals(s1));
	}

}
