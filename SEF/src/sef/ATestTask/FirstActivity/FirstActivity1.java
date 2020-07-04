package sef.ATestTask.FirstActivity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FirstActivity1 {

	public static void main(String[] args) {
		
		Map<Integer, Employee> employeemap = new HashMap<Integer, Employee>(); 
		
		Employee e1 = new Employee("Tatjana", "Kravc", 33, 1, "Auditor", "Java", 2000);
		Employee e2 = new Employee("Niks", "Brigg", 25, 2, "Realtor", "House", 1500);
		Employee e3 = new Employee("Toms", "Darbin", 28, 3, "Programmer", "JavaC", 3000);
		Employee e4 = new Employee("Kate", "Matew", 26, 4, "Architect", "Palace", 25000);
		Employee e5 = new Employee("Gven", "Lorenc", 31, 5, "Chef", "Fast", 3500);
		Employee e6 = new Employee("Abbey", "Hatcher", 20, 6, "Designer", "Beauty", 1800);
		Employee e7 = new Employee("John", "Tailor", 35, 7, "Engeneer", "Create", 39000);

		employeemap.put(e1.getEmpId(), e1);
		employeemap.put(e2.getEmpId(), e2);
		employeemap.put(e3.getEmpId(), e3);
		employeemap.put(e4.getEmpId(), e4);
		employeemap.put(e5.getEmpId(), e5);
		employeemap.put(e6.getEmpId(), e6);
		employeemap.put(e7.getEmpId(), e7);
		
		Iterator<Integer> iterator = employeemap.keySet().iterator(); 
		while (iterator.hasNext()) {	
			Employee emp = employeemap.get(iterator.next());
			emp.display();
		}
		
		System.out.println("------------------------Sorted by salary------------------------------------");
		
		Map<Double, Employee> employeeMapBySalary = new TreeMap<Double, Employee>();
		employeeMapBySalary.put(e1.getSalary(), e1);
		employeeMapBySalary.put(e2.getSalary(), e2);
		employeeMapBySalary.put(e3.getSalary(), e3);
		employeeMapBySalary.put(e4.getSalary(), e4);
		employeeMapBySalary.put(e5.getSalary(), e5);
		employeeMapBySalary.put(e6.getSalary(), e6);
		employeeMapBySalary.put(e7.getSalary(), e7);
		
		Iterator<Double> iterators = employeeMapBySalary.keySet().iterator(); 
		while (iterators.hasNext()) {	
			Employee emps = employeeMapBySalary.get(iterators.next());
			emps.display();
		}
		
		System.out.println("--------------------Student as a person introduced--------------------------");
		Person ps = new Student(2, "Latvian University");
		System.out.println(ps.announce());
		
		System.out.println("--------------------Student introduced--------------------------");
		Student s = new Student();
		s.setSchoolName("Riga Technical University");
		System.out.println(s.announce());

	}

}

//TODO 4 Create method for full change of employee information
		// for example some employee change his work
