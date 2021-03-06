package sef.ATestTask.FirstActivity;
import java.util.*;
public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
    	this.empId = 0;
    	this.jobTitle = "Unknown";
    	this.companyName = "Unknown";
    	this.salary = 0;
    }

    
    public Employee (String firstName, String secondName, int age, int empId,String jobTitle, String companyName, double salary) {
    	super(firstName, secondName, age);
    	this.empId = empId;
    	this.jobTitle = jobTitle;
    	this.companyName = companyName;
    	this.salary = salary;
    }
    //TODO 2 add getters and setters


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
    

    //TODO 3 override method announce()
	public String announce(){
		super.announce(); 
		return "I am working as a" + "\t"+ getJobTitle() + " in a company " + getCompanyName() + ".";
	}
	
	public void display()
	{
		System.out.println(getEmpId() + "\t" +getFirstName() + "\t" + getSecondName() + "\t" + getAge() + "\t"+ getJobTitle() + "     \t" + getCompanyName() +"\t" + getSalary());
	}

}