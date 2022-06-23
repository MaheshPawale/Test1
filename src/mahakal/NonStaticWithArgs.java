package mahakal;

public class NonStaticWithArgs {

	int m(int a, int b) {
		
	int d = a-b;
	System.out.println(d);
	return d;}
	
	static String m1(int a, int b) {
		
		int d = a-b;
		String z ="mahesh";
		System.out.println(d);
		System.out.println(z);
		return z;}
	

public static void main(String[] args) {
	NonStaticWithArgs ref = new NonStaticWithArgs();
	ref.m(17,10);
	System.out.println(ref.m(17,10));
	
	System.out.println();//
	NonStaticWithArgs.m1(17,10);
System.out.println(m1(17,10));

System.out.println();//
 String C = NonStaticWithArgs.m1(12,13);
 System.out.println(C);
}
}

