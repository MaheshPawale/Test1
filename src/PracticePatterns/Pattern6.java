package PracticePatterns;

public class Pattern6 {
	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		int c= 30;
		int d= a+b;
		

		{

		if (c>=b == true);
		System.out.println(""+"*********");
		if (d==30 == true);
		System.out.println(" "+"*******");
		if (c<=30 == true);
		System.out.println("  "+"*****");
		if (a<c == true);
		System.out.println("   "+"***");
		if (a<b == true);
		System.out.println("    "+"*");}
		
		System.out.println();
		
		for(int e=1; e<=5; e++)
		{for(int f=1;f<=e; f++)
			System.out.print(" ");
		for(int f=e;f<=5; f++)
			System.out.print("*");
		for(int f=4;f>=e; f--)
			System.out.print("*");
		System.out.println();
		}
		
	}

}
