package org.trails;

import java.util.Scanner;

public class AgeAuthentication {
	public static void main(String[] args) {
		
		System.out.println("enter your Age:");
		Scanner S = new Scanner(System.in);
		
		int age = S.nextInt();
		
		if (age >= 18) {
			System.out.println("Age Authentication Successful you can Enter now");
		} 
		else {
			System.out.println("Entry Access denied!!! Age Authentication Unsuccessful");
		}
	}

}
