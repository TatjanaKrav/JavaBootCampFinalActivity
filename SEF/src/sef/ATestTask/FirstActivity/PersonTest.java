package sef.ATestTask.FirstActivity;
import junit.framework.TestCase;

public class PersonTest extends TestCase{
	Person person = new Person();
	
	public void checkEmployeeCreatedProperly(){
	
    person.setFirstName("Irina");
    assertEquals("I am an error message", "Irina", person.getFirstName());
    
    person.setSecondName("Kravcenko");
    assertEquals("I am an error message", "Kravcenko", person.getSecondName());
    
    person.setAge(22);
    assertEquals("I am an error message", 22, person.getAge());
    
	}

}