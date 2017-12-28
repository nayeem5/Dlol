package com.talentech.javaBasic;

import java.util.Scanner;

public class userinputscannerclass {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		//System.out.println("enter ur range: ");
		//int range=s.nextInt(); //if we wanna have string then String name=s.nextln();
		
		System.out.println("enter ur name:"); 
		String name=s.nextLine();
		
		System.out.println("enterur age: ");
		int age=s.nextInt();
		System.out.println("age="+age);
		
		/*int sum=0;
		for(int i=1; i<=range; i++) {
			
			sum=sum+i;
		}
		
		System.out.println("range "+range);
        System.out.println("sum "+sum);*/
        System.out.println("name="+name);
	}

}
