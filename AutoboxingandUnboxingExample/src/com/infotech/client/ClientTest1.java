package com.infotech.client;


//Java program to illustrate the concept
//of Autoboxing and Unboxing
public class ClientTest1 {

	public static void main(String[] args) {

		 // creating an Integer Object
       // with value 10.
       Integer n = new Integer(10);

       // unboxing the Object
       int number = n;

       System.out.println("Value of n: " + n);
       System.out.println("Value of number: " + number);

       //Autoboxing of char
       Character c = 'a';

       // Auto-unboxing of Character
       char ch = c;
       System.out.println("Value of ch: " + ch);
       System.out.println("Value of c: " + c);
	
	}
}
