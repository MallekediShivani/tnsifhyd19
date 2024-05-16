package overridding;

public class Instance {
	
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.display();
		
		Parent p2 = new Child();
		p2.display();
		
	}
	

}
