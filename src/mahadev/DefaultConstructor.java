package mahadev;

public class DefaultConstructor {
	
	static int a;
	static int b;
	void m (int a , int b) {
		int c=a+b;
		System.out.println(c);
	}
    void m1 () {
		
	}
	
	
	
	public static void main(String[] args) {
		DefaultConstructor p = new DefaultConstructor();   // call only constructor 1st because arg. are int type
		p.m(a, b);
				
			
	}
	}

