
public class Student {

	private int studentID;
	private String studentName;
	private String studentCourse;
	private String studentGrade;
	private double studentScore;
	private boolean currentStudent;
	
	public Student() {
		/*
		 * when we create a static variable method that is unique 
		 * there can only be one
		 * 
		 * non static variables area methods defined in a lass that means if i was to instatntitate te class
		 * create the object i'll 
		 */
	}
	
	public Student(int studentID, String studentName, String studentCourse) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		currentStudent = true;
		
	}
	
	public void setCurrentStatus(boolean currentStudent) {
		this.currentStudent = currentStudent;
	}
	
	public boolean isCurrentStudent(){
		return currentStudent;
		}
	public double getStudentScore() {
		return studentScore;
		
	}
	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
		calcGrade();
	}
	
	public void setGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	
	public void calcGrade() {
		if(studentScore<50) {
			studentGrade = "Unsuccessful";
					
		}
		else if(studentScore<65) {
			studentGrade = "pass";
		}
		else if(studentScore<80) {
			studentGrade = "merit";
		}
		else if(studentScore<=100) {
			studentGrade = "distinction";
		}
		else {
			System.out.println("Invalid score");
			studentGrade = "Invalid";
		}
	}
	
	public String getStudentGrade() {
		return studentGrade;
	}
	
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	
	public String getStudentCourse() {
		return studentCourse;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void printAllDetails() {
		System.out.println("-----------------------------------");
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Name: " + studentName);
		System.out.println("Score: " + studentScore);
		System.out.println("Course: " + studentCourse);
		System.out.println("Grade: " + studentGrade);
		System.out.println("-----------------------------------");
		
		if(currentStudent==true) {
			System.out.println("Status: Current Student");
		}
		else {
			System.out.println("Status: Not a current Student");
		}
	}
	
	public void print() {
		System.out.println("-----------------------------------");
		System.out.print("Student ID: " + studentID);
		System.out.print("\t Student Name: " + studentName);
		System.out.print("\t Course: " + studentCourse);
		System.out.println("\t Grade: " + studentGrade);
		System.out.println("-----------------------------------");
	}

}
