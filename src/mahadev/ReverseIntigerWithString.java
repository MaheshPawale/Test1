package mahadev;

public class ReverseIntigerWithString {
	
	public static void main(String[] args) {
		int a = 534273;
		
		String orgNum = Integer.toString(a);
		String revNum = "";
		
		for(int i=orgNum.length()-1; i>=0; i--) {
			revNum = revNum + orgNum.charAt(i);
		}
		
		//System.out.println(revNum);
		
		int MyRevNum = Integer.parseInt(revNum);
		System.out.println("Reverse no. is = "+MyRevNum);
		
		
		
	}

}
