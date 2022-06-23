package shiv;

public class aa {
int a=10;
int b=20;
	
	
	char  m1 () {
		char g ='a';
		int c= a+b;
		System.out.println(c);
		return 0;
	}
	 boolean m2() {
		 int d = a*b;
		 System.out.println(d);
		int e= 100;
		 return true;
		
	}
	public static void main(String[] args){
		aa v = new aa();
		System.out.println(v.m1());
		System.out.println(v.m2());;
	
	}
}