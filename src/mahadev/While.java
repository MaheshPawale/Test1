package mahadev;

public class While {
	public static void main(String[] args) {
		short a= 10;
		
		while(a>0) 
		{	
		a--;
		System.out.println(a);
		
		}
		
	}

}

/* Here why print 0 because a--; after condition. So first it check condition 
   then it a--; & after that it print value for a */