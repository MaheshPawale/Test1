package mahakal;

public class CallMethod1 {
	
	public static void main(String[] args) {
		method ref = new method();
		ref.m1 ();
		System.out.println();
		
		Method1 ref1 = new Method1();
		ref1.m1 (12, 12);
		System.out.println(ref1.m1 (12, 12));
		System.out.println();
		
		NonStaticWithArgs.m1(0, 0);
		System.out.println(NonStaticWithArgs.m1(0, 0));
	}

}
