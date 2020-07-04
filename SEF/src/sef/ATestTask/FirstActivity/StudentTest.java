package sef.ATestTask.FirstActivity;
import junit.framework.TestCase;

public class StudentTest extends TestCase {
	 Student student = new Student();
	public void checkStudentCreatedProperly(){
       
        student.setGrade(2);
        assertEquals("I am an error message", 2, student.getGrade());
        
        student.setSchoolName("RTU");
        assertEquals("I am an error message", "RTU", student.getSchoolName());   
    }
	
	public void stcheckStringReturnsCorrectValues() {
		
		student.setSchoolName("LU");
    	String sttestString = "I study at	LU.";
    	assertEquals("I am an error message", sttestString, student.announce());
    	
    }
	
	
}
