package week3.day1;

public class MatchingElements {
	public static void main(String[] args) {
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };
//		To find First Array Length
		int i = a.length;

//      To find Second Array Length
		int j = b.length;
        System.out.println("Compare Two Arrays matching elements are");
//      Looping for First Array
		for (i = 0; i < a.length; i++) {
//        	Looping for Second Array
			for (j = 0; j < b.length; j++) {
//            	Compare Arrays using Conditional Statements
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}

			}

		}
	}

}
