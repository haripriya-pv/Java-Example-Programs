package examplePrograms;

public class StringExp {

	public StringExp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s= new String( "I love Java Programming");
		StringBuffer buf = new StringBuffer(s);
		buf.reverse();
		int l=0;
		System.out.println(buf);
		char rev[]=new char[s.length()];
		for(int i=s.length()-1;i>=0;i--) {
			rev[l] = s.charAt(i);
			l++;
		}
        String revv=rev.toString();
        System.out.println(rev.toString());
	}

}
