package PracticePatterns;

public class Pattern8 {
public static void main(String[] args) {
	
	
	for( int a=5;  a>=0;  a--)
	{ for ( int b=5;  b>=a;  b--)
		System.out.print("*");
	System.out.println();
	}

	
	for( int a=5;  a>=0;  a--)
	{ for ( int b=1;  b<=a;  b++)
		System.out.print("*");
	System.out.println();
	}
	
	System.out.println();
	
	 
}
}


