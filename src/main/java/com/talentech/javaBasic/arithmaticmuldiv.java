package com.talentech.javaBasic;

public class arithmaticmuldiv {

	public static void main(String[] args) {
		int x,y,mul,div,sub;
		x=10; y=5;
		
		//basic mul,div.
		mul=x*y;
		div=x/y;
		System.out.println("mul is: "+mul);	
	    System.out.println("div is : "+div);
	    
		//conditional statement
		
	    if (x>y) {
			sub=x-y;
	    }
		else {
			sub=y-x;
		}
		System.out.println("sub="+sub);	
	
	
	}

}
