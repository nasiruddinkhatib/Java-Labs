package InheritanceQuestion1;

public class Citizen extends Person {
public static void main(String[]args) {
	// citizenClass inherit PersonClass --> Single level Inheritance
			Person p1 = new Person();    // object created
			p1.fname = "Nasiruddin";
			p1.lName = "Khatib";
			
			
			System.out.println(p1.getFname());    // calls personMethods
			System.out.println(p1.getlName());
			
			

		}

}


