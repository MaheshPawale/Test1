package mahakal;
public class PracticeForStaticNonstatic {
	static int a=12;
	int b=22;
	int c;
	int d=34;
	
	 void m(int h, int i) {
	int e=24;
	int f= 25;
	int g= h+i;
	System.out.println(g);}
	
	 PracticeForStaticNonstatic(int a,int c) {
		 int v= a+c;
		int b=60;
		System.out.println(v);
		System.out.println(this.a);}
	
	public static void main(String[] args) {
		PracticeForStaticNonstatic r= new PracticeForStaticNonstatic(20,20);
	/*	PracticeForStaticNonstatic r1= new PracticeForStaticNonstatic(200,200);
			System.out.println(r.d);
	r.m(55,24);
	System.out.println(PracticeForStaticNonstatic.a);*/
	}
	}
	
