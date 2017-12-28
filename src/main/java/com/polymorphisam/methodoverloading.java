package com.polymorphisam;

public class methodoverloading {
public void calculation (int num1,int num2,int num3) {
	int sum= num1+num2+num3;
	System.out.println( "the result is  "+sum);
}
public void calculation (int num1, int num2) {
	int balance;
	balance=num1-num2;
	System.out.println("substraction"  +balance);
	
}
public void calculation(double num1,int num2,int num3) {
	double multiply;
	multiply=num1*num2*num3;
	System.out.println("mul"+multiply);
	
}
}
