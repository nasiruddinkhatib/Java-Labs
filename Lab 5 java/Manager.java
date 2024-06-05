package InheritanceQuestion1;

public class Manager extends Employee {
	
	private String post = "Manager";   // it's a global variable, I can use it in this class, 
									   //even if it's a private variable
	

	public String getPost() {
		return post;
	}


	public static void main(String[] args) {
		// Person inherited by Employee inherited by Manager --> multiLevel inheritance
		// create PersonClass obj
		Person p2 = new Person();        
		p2.fname = "Nasir";
		System.out.println(p2.getFname());
		
		// create EmployeeClass obj
		Employee e1 = new Employee();
		e1.salary = 30000;
		System.out.println("I'll get " + e1.getSalary() + " salary");
		
		// create ManagerClass obj
		Manager m1 = new Manager();
		System.out.println("Designation - " + m1.post);    // it's a
		
	}

}


