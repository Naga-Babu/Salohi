package Constructor;

public class Employee {
	String name;
	int roll_no;
	String deg;

	public Employee(String emp_name, int emp_id, String emp_deg) {
		name = emp_name;
		roll_no = emp_id;
		deg = emp_deg;
		System.out.println(emp_name);
		System.out.println(emp_id);
		System.out.println(emp_deg);

	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Nagababu", 020145, "Developewer");
		Employee e2 = new Employee("rikith", 020203, "developer");
		Employee e3 = new Employee("Vinay", 020204, "developer");
	}

}
