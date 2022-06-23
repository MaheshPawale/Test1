package mahadev;

public class ReverseInteger {
	public static void main(String[] args) {

		String s = "mahesh is velocity person";

		for(int i=s.length()-1; i>=0; i--){
		String S = ""+s.charAt(i);
		System.out.print(S);
		}
	}

}
