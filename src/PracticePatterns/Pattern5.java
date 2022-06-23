package PracticePatterns;

public class Pattern5 {
	public static void main(String[] args) {
	
		for(int e=1;  e<=5; e++) 
		{for (int f=e; f<=5; f++)
			System.out.print(" ");
		for (int f=1; f<=e; f++)
			System.out.print("*");
		for (int f=2; f<=e; f++)
			System.out.print("*");
		System.out.println();
		}
		
	}

}
