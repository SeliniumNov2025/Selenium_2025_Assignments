package week3.day1;

public class ReverseString {

	public static void main(String[] args) {

		String companyName = "TestLeaf";

//		To convert String into Character Array
		char charName[] = companyName.toCharArray();
		System.out.println("Reversed String:-");
//		To find a Length of Char
		int i = charName.length;

//		To Reverse Backward loop i=8-1 ,i=7 char array value is 'f'
		for (i = charName.length - 1; i >= 0; i--) {
			System.out.print(charName[i]);

		}
	}

}
