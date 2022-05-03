package org.test;
import java.util.*;
public class WrittenTest {
	public void myId(){
		System.out.println("My Id :1040");
		}

		public static void main(String[]args){
		Scanner S=new Scanner(System.in);
		WrittenTest WT=new WrittenTest();
		
		System.out.println("Enter your Name");
		String name=S.nextLine();
		
		System.out.println("your name is "+name);
		WT.myId();
		}

}
