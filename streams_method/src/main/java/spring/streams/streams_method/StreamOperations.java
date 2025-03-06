package spring.streams.streams_method;

import java.util.ArrayList;
import java.util.List;

public class StreamOperations {

	public static void main(String[] args) {
		
		List<Employee> employees = employeeList();
		
		List<String> empNames = new ArrayList<>();
		
		for(Employee emp : employees) {
			empNames.add(emp.getName());
		}
		
		System.out.println(empNames);
		
		
		

	
	}
	
	public static List<Employee> employeeList(){
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1, "Raj", "Hyderabad", 30, "Male", "IT", 2015, 75000));
		employees.add(new Employee(2, "Priya", "Bangalore", 28, "Female", "HR", 2017, 68000));
	    employees.add(new Employee(3, "Amit", "Mumbai", 35, "Male", "Finance", 2012, 90000));
	    employees.add(new Employee(4, "Sita", "Chennai", 26, "Female", "Marketing", 2019, 65000));
	    employees.add(new Employee(5, "Kiran", "Delhi", 40, "Male", "Admin", 2009, 85000));
	    employees.add(new Employee(6, "Anjali", "Kolkata", 32, "Female", "Operations", 2016, 72000));
	    employees.add(new Employee(7, "Vikram", "Pune", 29, "Male", "Sales", 2018, 70000));
	    employees.add(new Employee(8, "Neha", "Jaipur", 27, "Female", "Support", 2020, 62000));
	    employees.add(new Employee(9, "Arjun", "Ahmedabad", 33, "Male", "IT", 2014, 78000));
	    employees.add(new Employee(10, "Meera", "Lucknow", 31, "Female", "Finance", 2013, 86000));
		return employees;
	}
	
	

}
