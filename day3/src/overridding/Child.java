package overridding;
public class Child extends Parent{
	public void display() {
		System.out.println("Child instance method");
	}
	
	public static void print() {
		System.out.println("Child static method");
	}

}