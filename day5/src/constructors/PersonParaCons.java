package constructors;

public class PersonParaCons {
private String name;
private int age;
public PersonParaCons(String name,int age) {
	this.name=name;
	this.age=age;
 }
public void details() {
	System.out.println("Name: "+name);
	if(age<18) {
	     System.out.println("minor");	
	}else {
		System.out.println("major");
	}
	
	
}



}
