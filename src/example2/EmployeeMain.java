package example2;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee e1=new Employee(101, "Steve");
		Employee e2=new Employee(102, "Stella");
		
		e1.printEmployee();
		e2.printEmployee();
		
		Employee e3=new Employee(103, "Robby", 23, "Alaska");
		e3.printEmployee();
	}

}
