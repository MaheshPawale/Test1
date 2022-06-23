package PracticePatterns;

public class Pattern16 {
	public static void main(String[] args) {
		for (int a=1; a<=3; a++) 
		{System.out.println("*");
			for (int b=a; b<=a; b++) 
				System.out.print("*");
			for (int c=2; c<=a; c++) 
				System.out.print(" ");
			}
		
		for (int a=1; a<=1; a++) 
		{System.out.println("*");
			for (int b=1; b<=5; b++) 
				System.out.print("*");}
	}
}
