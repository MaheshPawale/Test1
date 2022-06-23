package PracticePatterns;

public class Pattern14 {
	public static void main(String[] args) {
		for (int a=4; a>=0;  --a)
		{ for (int b=4; b>=a;  --b)
			System.out.print(" ");
		for (int b=a; b>=0;  --b)
			System.out.print("*");
		for (int b=a; b>0;  --b)
			System.out.print("*");
		System.out.println();
		}
		for (int a=3; a>=0;  --a)
		{ for (int b=a; b>=0;  --b)
			System.out.print(" ");
		for (int b=4; b>=a;  --b)
			System.out.print("*");
		for (int b=4; b>a;  --b)
			System.out.print("*");
		System.out.println();
		}
	}

}
