package mahadev;

public class DoWhileLoop {
	public static void main(String[] args) {
		
		
		int a=24;
		do
		{ a++;
			System.out.println(a);
		a++;}
		while (a>30);  // here a==30 not accept because
	}                  // we already assign value for a

}


/*here a==30 not accept because we already assign value for 'a'
 while (a>30); for this condition console print only 25 because 'a' is 
 not greater than 30 & 25 for first iteration */