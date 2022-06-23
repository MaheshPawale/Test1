package PracticePatterns;

public class Pattern13 {
	public static void main(String[] args) {
		
		for (int a=5; a>=0;  --a)
		{ for (int b=4; b>=a;  --b)
			System.out.print(" ");
		for (int b=0; b<=a;  ++b)
			System.out.print("*");
		System.out.println();
		}
		
		for (int a=0; a<=4;  a++)
		{ for (int b=a+1; b<=4;  b++)
			System.out.print(" ");
		for (int b=-1; b<=a;  b++)
			System.out.print("*");
		System.out.println();
		}
		
	}

}
