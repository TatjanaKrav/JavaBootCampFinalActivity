package sef.ATestTask.FirstActivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;

public class FirstActivity {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/employees"; 
		String user = "root";
		String pass = "tanjandrej";
		
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
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
	
		String query = "insert into employees values (?,?,?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(query);	
		st.setInt(1, e1.getEmpId());
		st.setString(2, e1.getFirstName());
		st.setString(3, e1.getSecondName());
		st.setInt(4, e1.getAge());
		st.setString(5, e1.getJobTitle());
		st.setString(6, e1.getCompanyName());
		st.setDouble(7, e1.getSalary());
		int count = st.executeUpdate();
		
		st.close();
		con.close();
		
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






	
