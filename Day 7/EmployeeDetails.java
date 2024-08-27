class Person{
	public String Name(String name){
		return name;
	}
	public int Age(int age){
		return age;
	}
}

class Employee extends Person{
	public String EmployeeID(String employeeid){
		return employeeid;
	}
	public String Department(String department){
		return department;
	}
}

public class EmployeeDetails{
	public static void main(String[] args){
		Employee obj=new Employee();
		String Employeename=obj.Name("Rohith kumar");
		int EmployeeAge=obj.Age(25);
		String EmployeeId=obj.EmployeeID("23110041");
		String Employeedepartment=obj.Department("HR");
		System.out.println("Employee Name :" + Employeename);
		System.out.println("Employee Age :" + EmployeeAge);
		System.out.println("Employee ID :" + EmployeeId);
		System.out.println("Employee Department :" + Employeedepartment);
	}
}




	