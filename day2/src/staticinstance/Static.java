package staticinstance;

public class Static {
	static int a=10;
	static void display1()
	{
		System.out.println("display method");
	}
	public static void main(String[] args) {
		System.out.println(a);
		display1();		
		
	}

}
