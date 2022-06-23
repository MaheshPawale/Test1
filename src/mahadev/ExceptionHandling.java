package mahadev;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a= 10;
		int b= 0;
	
		
		
		try {
			int c= a/b;
		}
		
		 catch (ArithmeticException r)  {
			 System.out.println("catch");
		 }
		try {
			
		}
		catch (NullPointerException e) {
			System.out.println("catch 2");
		}
		catch (Exception e) {
			
		}
		
		finally {
			System.out.println("finally");
		}
		
	}

}
