package staticinstance;
//accessing instance variable and method
public class Instance {
int a=20;
public String display() {
	return "display method";
}
	public static void main(String[] args) {
		        Instance i1 = new Instance();
		        System.out.println(i1.a);
		        System.out.println(i1.display());

	}

}

