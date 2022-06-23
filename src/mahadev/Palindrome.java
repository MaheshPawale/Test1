package mahadev;

public class Palindrome {

	public static void main(String[] args) {
		int r;
		int sum=0; 
		int temp;
		
		int n= 554;
		temp= n;
		
		while(n>0)
		
		{ r=n%10;
		  n=n/10;
		  sum=(sum*10)+r;
		 
		  
		}
		if(temp==sum) {
			System.out.println(" This is palendrome no."+temp);
		}
		else {System.out.println(" This is not palendrome no."+sum);
			
		}
			
	}
}
