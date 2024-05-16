package polymorphism;

public class Overload {
		
		// method without parameter
		  public void display() {
		    for (int i = 0; i < 5; i++) {
		      System.out.print("A");
		    }
		  }

		  // method with single parameter
		  public void display(char symbol) {
		    for (int i = 0; i < 5; i++) {
		      System.out.print(symbol);
		    }
		  }
}

