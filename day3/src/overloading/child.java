package overloading;

public class child extends Parent{
	String display() {
		return "instance child method";
	}
static String display1() {
	return "Static child method";
    }
}
