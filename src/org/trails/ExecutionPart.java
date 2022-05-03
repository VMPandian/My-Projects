package org.trails;

public class ExecutionPart {
	public static void main(String[] args) {
		System.out.println("/*1\t\t2\t\t\t3.1\t\t\t3.2\t\t3.3\t\t4");
		for (int i = 1; i <= 100; i++) {
			boolean j= (i<=100);
			boolean x =(i==5);	
			String y;
			if(i==5) {
				y="null";
			}
			else {
				y="skip";
			}
			System.out.println(" *i="+i+"\t\t"+i+"<=100"+j+"\t\t"+i+"==5"+x+"\t\t"+y+"\t\t"+i+"\t\t"+i+"+1");
		}System.out.println(" *End of Execution\n */");
	}
}