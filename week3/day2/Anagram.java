package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int i = text1.length();
		int j = text2.length();

//		To check the lengths
		if (i == j) {

		} else {
			System.out.println("Length mismatch, therefore the strings are not an Anagram");
		}

//		To convert Strings into Character Array
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();

//		Sort the Both Arrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

//		To check sorted Arrays
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("The given Strings are  Anagram");
		} else {
			System.out.println("The given Strings are not an Anagram");
		}
	}

}
