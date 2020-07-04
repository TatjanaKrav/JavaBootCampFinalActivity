package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
        
        employee.setSecondName("Kravcenko");
        assertEquals("I am an error message", "Kravcenko", employee.getSecondName());
        
        employee.setEmpId(2);
        assertEquals("I am an error message", 2, employee.getEmpId());
        
        employee.setJobTitle("Manager");
        assertEquals("I am an error message", "Manager", employee.getJobTitle());
        
        employee.setCompanyName("DNB");
        assertEquals("I am an error message", "DNB", employee.getCompanyName());
        
        employee.setSalary(2000);
        assertEquals("I am an error message", 2000.0, employee.getSalary());
    }
    public void checkStringReturnsCorrectValues() {
    	Employee employee = new Employee();
    	employee.setJobTitle("Manager");
    	employee.setCompanyName("DNB");
    	String testString = "I am working as a	Manager in a company DNB.";
    	assertEquals("I am an error message", testString, employee.announce());
    	
    }
}