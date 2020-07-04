package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
	
private int grade;
private String schoolName;
 
    public Student(){
    	this.grade = 0;
    	this.schoolName = "Unknown";
    }

    public Student (int grade,String schoolName) {
    	this.grade = grade;
    	this.schoolName = schoolName;
    }

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String announce(){
		super.announce(); 
		return "I study at" + "\t"+ getSchoolName() + ".";
	}
    
}
