package PracticePatterns;

public class Patttern9 {
	public static void main(String[] args) {
		
		for (int a=1; a<=5; a++) 
		{for (int b=a; b<=5; b++)
			System.out.print(" ");
		for (int b=1; b<=a; b++)
			System.out.print("*");
		
		System.out.println();}
		for (int c=2; c<=5; c++) 
		{for (int d=1; d<=c; d++) 
			System.out.print(" ");
		for (int d=c; d<=5; d++) 
			System.out.print("*");
		System.out.println();
			
		}
	}

}
