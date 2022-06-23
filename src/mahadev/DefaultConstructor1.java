package mahadev;

public class DefaultConstructor1 {
	
	static int id =10;
	static String name;
	
	static int id1;
    String name1;
    static int id2 = 20;
	
 static	void m1 () {  // For static method need only static global variables
		
		System.out.println(id+ " "+name);
	}
 
 	void m2 () {   // For non-static method need  non-static/static global variables
		
		System.out.println(id1+ " "+name1);
	}
 
   private void m3 (float a) {   
		int c = id + id2;
		System.out.println(c);
		System.out.println(id1+ " "+name1);
	}
	public static void main(String[] args) {
		
		
		DefaultConstructor1 r = new DefaultConstructor1();
		
		r.m1();
		r.m2();
		r.m3(id);
	}
}
