package com.assignment1;

public class AccessClass {
	public static void main(String[] args)
	{
	Normalclass	n1=new Normalclass();
	System.out.println(n1.a);
	n1.display();
	System.out.println(Normalclass.b);
	System.out.println(Normalclass.display1());
	}	
}