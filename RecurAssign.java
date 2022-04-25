package assignment;

public class RecurAssign {

	
	//Recursive method that returns the sum of all the even numbers between smallestInt and largestInt
	//e.g smalestInt: 3, largestInt:7, should return 10.
	//base case must call MyStackTrace.printTrace()
	public int sumEvenNumbersOnly(int smallestInt, int largestInt) {
		if (smallestInt % 2 != 0) {
			smallestInt++;
		}
		if (smallestInt > largestInt) {
			MyStackTrace.printTrace();
			return 0;
		}

		else {
				return smallestInt + sumEvenNumbersOnly(smallestInt + 2, largestInt);
		}

//		else {
//			for (int i = smallestInt; i <= largestInt; i++ ) {
//				if (i % 2 == 0) {
//					sum += i;
//				}
//			}
//			
//		}
//		return sum;
		
	}
	
	//Recursive method that returns the given text without 'a' or 'A' in it.
	//e.g text: "Allan", should return the string "lln".
	//if text is null, return the empty string ""
	//base case must call MyStackTrace.printTrace()
	public String removeAs(String text) {
		if (text == null) {
			MyStackTrace.printTrace();
			return "";
		}
		else if (text.length() == 0) { 
			MyStackTrace.printTrace();
			return "";
		}
		else if (text.charAt(0) == 'a' || text.charAt(0) == 'A') {
			return removeAs(text.substring(1));
		}
			return text.substring(0, 1) + removeAs(text.substring(1));
		
	}
}
