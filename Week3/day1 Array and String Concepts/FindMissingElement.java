package week3.day1;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		int rollNumber[] = { 1, 4, 3, 2, 8, 6, 7 };

		System.out.println("Missing Number :");
//		To find Length of Array
		int i = rollNumber.length;
//      To Sort the Array
		Arrays.sort(rollNumber);
//		for loop - Iterate
		for (i = 0; i < rollNumber.length; i++) {

//		To find missing number when	i=4, rollNumber[4]=6(Array value) not equal to 5(4+1)
			if (rollNumber[i] != i + 1) {
				System.out.println(i + 1);
				break;
			}

		}

	}

}
