package PracticePatterns;

public class Pattern7 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) 
				System.out.print(i);
							
	System.out.println();	}
	
		System.out.println();
		for (int e=1;  e<=5; e++) 
		{ for (int f=e;  f<=5; f++) 
			System.out.print(" ");
		for (int f=1;  f<=e; f++) 
			System.out.print("*");
		for (int f=2;  f<=e; f++) 
			System.out.print("*");
		System.out.println();	
		}
		
		for ( int g=2; g<=5; g++) 
		{ for( int f=1; f<=g; f++)
			System.out.print(" ");
		//System.out.print("*");
		for( int f=g; f<=5; f++)
			System.out.print("*");
		for( int f=g; f<=4; f++)
			System.out.print("*");
			System.out.println();
		}
		
	}

}
