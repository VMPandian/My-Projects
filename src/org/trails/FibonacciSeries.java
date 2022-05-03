package org.trails;
import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("enter the maximum limit of the series");

		long endValue = S.nextLong();
		long x=0;
		long y=1;
		long z=x+y;
		System.out.println(x);

		while (z<endValue){	
		System.out.println(z);
		z=x+y;
		x=y;
		y=z;
		}
	}
}
//while ,for,for each, do while are loop concepts