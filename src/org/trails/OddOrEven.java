package org.trails;

import java.util.*;//importing all classes including scanner class from java.util package

public class OddOrEven {
	private void OddAndEvenSum() {
		int totalOfOdd = 0;
		int totalOfEven = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				totalOfEven = totalOfEven + i;
			} else {
				totalOfOdd = totalOfOdd + i;
			}
		}
		System.out.println("totalOfEven is " + totalOfEven);
		System.out.println("totalOfOdd is " + totalOfOdd);
	}

	// creating main method
	public static void main(String[] args) {
		OddOrEven OE=new OddOrEven();
		OE.OddAndEvenSum();

		// assigning object for scanner class
		Scanner s = new Scanner(System.in);
		// user input
		System.out.println("enter number to check odd or even");
		long number = s.nextLong(); // if block
		if (number % 2 == 0) {
			System.out.println(number + " is a Even number");
		}
		// else block
		else {
			System.out.println(number + " is a odd number");
		}
		
	}

}