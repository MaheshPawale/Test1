package PracticePatterns;

public class Pattern10 {
	public static void main(String[] args) {
		
		for ( int a=1; a<=5; a++) 
		{
			for ( int b=a; b<=5; b++)
				System.out.print(" ");
			
			for ( int b=1; b<=5; b++)
				System.out.print("*");
			System.out.println();
		
		}	
	}

}
