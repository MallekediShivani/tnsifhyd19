package constructors;

public class PersonDefCons {
private String name;
private int age;
public PersonDefCons() {
	name="ravi";
	age=25;
  }
public void details() {
	System.out.println("Name:"+name);
	if(age<18) {
		System.out.println("minor");
	}
	else {
		System.out.println("major");
	}
}

}
