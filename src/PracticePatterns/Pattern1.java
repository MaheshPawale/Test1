package PracticePatterns;

public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("with using i");
		for(int i=1; i<=5; i++ ) 
		{   for(int j=1; j<=i; j++ )
		System.out.print(i);
		System.out.println();}
		
		System.out.println();
		System.out.println("with using j");
		for(int i=1; i<=5; i++ ) 
		{   for(int j=1; j<=i; j++ )
		System.out.print(j);
		System.out.println();}
		
	}

}
