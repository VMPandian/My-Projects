package org.trails;

import java.util.*;//imports all classes from java.utill package
public class RandomNumbers{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		//to get user inputs
		System.out.println("enter starting value:");
		int start = S.nextInt();
		System.out.println("enter end value:");
		int end = S.nextInt();
		System.out.println("enter how many random number required:");
		byte count = S.nextByte();
		//for random number
	    System.out.println("\nHere is your "+count+" Random numbers from "+start+" to "+end+".\n===============================================");
		for (double i = 1; i <= count; i++) {
		    double x = start + (double) (Math.random() * (end-start));
		    System.out.println(x);
		}
	}
}
