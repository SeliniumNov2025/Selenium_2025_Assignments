package week3.day2;

public class Odd_Index_To_Uppercase {

	public static void main(String[] args) {
		String test = "change";

//		To covert String into Character Array
		char[] charArray = test.toCharArray();

//		Looping the Character Array
		int i;
		for (i = charArray.length - 1; i >= 0; i--) {
			if (i % 2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);

			}

		}
		System.out.println(charArray);

	}

}
