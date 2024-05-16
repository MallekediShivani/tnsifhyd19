package com.assignment1;

public class Approach1 {
	int a=10;
	static int b=20;
	void display()
	{
		System.out.println("hi");
	}
	static String display1()
	{
		return "bye";
	}
	public static void main(String[] args)
	{
	Approach1 a1=new Approach1();
	System.out.println(a1.a);
	a1.display();
	System.out.println(b);
	System.out.println(display1());
	}

}
