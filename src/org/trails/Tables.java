package org.trails;

import java.util.*;

public class Tables {
	public void tables() {
		Scanner S = new Scanner(System.in);
		System.out.println("enter multiplication factor");
		int tables = S.nextInt();
		System.out.println("Enter the Number of tables Required");
		int z =S.nextInt();
		int i = 1;
		while (i <= z) {
			System.out.println(tables+ " * " + i + "\t= " + (tables * i));
			i++;
		}
	}
	public static void main(String[] args) {
		Tables T=new Tables();
		T.tables();
		}
	}