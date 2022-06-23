package mahakal;

public class AssignValuesForGV {
	
	 int a;
	 int b;
	
	static int s1( int e,  int f) {
		 int c = e+f;
		System.out.println(c); 
		return c;  }
	
    void s2(int a, int b) {
    	int d = a*b;
    	int e= this.a;
    	int f= this.b;
    	int g= e*f;
    	System.out.println(d); 
    	System.out.println(g);}
    
    
    AssignValuesForGV(int a , int b){
    	
    	System.out.println(a+b);
    	
    }
    
    
    void m2 (int a ,int b){
    	
    	System.out.println(a+b);
    	
    }
    
    void m1() {
    	System.out.println(a+b);
    }
    
    
    public static void main(String[] args) {
    	
    	AssignValuesForGV ref = new AssignValuesForGV(50,50);
    	ref.s2(12 , 15);
    	ref.m1();
    	ref.m2(10, 10);
    	
    	AssignValuesForGV.s1(22 , 14);	
    	System.out.println(AssignValuesForGV.s1(22 , 14));
		
	}	
}
