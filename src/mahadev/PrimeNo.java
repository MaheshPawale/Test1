package mahadev;

public class PrimeNo {
	public static void main(String[] args) {
		
	int a=5;
	
		if ((a%2!=0)&& (a%3!=0)) {
		//if(a%5!=0) 
				System.out.println("It is a Prime no.");
		}
		else {
			System.out.println("It is not a Prime no.");
		}
		
		
		for(int i=6; i<=20; i++) {
		if ((i%2!=0)&& (i%3!=0)) {
			if(i%5!=0) 
					System.out.println("It is a Prime no."+i);
			}
			else {
				System.out.println("It is not a Prime no."+i);
			}
		
		
		}
		
		
		
	}


}