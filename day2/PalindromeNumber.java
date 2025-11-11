package week1.day2;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int input = 121;
		int org = input;
		int rev = 0;
		for (int i = input; i > 0; i = i/10) {
			
			int remain = i%10;
			rev = (rev*10) + remain;
		}
		if(org == rev) {
			System.out.println(org + " is a Palindrome number");
			
		}else {
			System.out.println(org + " is not a Palindrome number");

		}
			
	}
}
