package PracticePatterns;

public class Pattern11 {
	public static void main(String[] args) {
		
		for ( int a=1; a<=5; a++) 
		{
			for ( int b=1; b<=a; b++)
				System.out.print(" ");
			
			for ( int b=1; b<=5; b++)
				System.out.print("*");
			System.out.println();
		
		}
	}

}