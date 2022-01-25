import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class studentApplication implements printDetailsMini {
	static int centralID = 101;
	//Numbers
	static Scanner input = new Scanner(System.in);
	
	static ArrayList<Student> studentList = new ArrayList<Student>();
	//Text
	static InputStreamReader textInput = new InputStreamReader(System.in);
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		prePopulate();
		menu();
	}
	
	public static void prePopulate() {
		Student s1 = new Student();
		s1.setStudentID(99);
		s1.setStudentName("Alan Adams");
		s1.setStudentCourse("CSC");
		s1.setStudentScore(66);
		studentList.add(s1);
		
		Student s2 = new Student(100, "Brian Burke", "Games design")	;
		s2.setStudentScore(50);
		s2.calcGrade();
	}
	public static void createStudent() {
		try {
		System.out.println("Enter Name");
			String name = reader.readLine();
			
			System.out.println("Enter Student Scores");
			String course = reader.readLine();
			
			Student s = new Student(centralID, name, course);
			centralID++;
			studentList.add(s);
		} 
		catch (IOException e) {
			System.out.println("An error occured");
		}
		
	}
	public static void viewStudents() {
		printMini();
	}

	private static void printMini() {
		for(Student s: studentList) {
			s.print();
		}
		for(Student s: studentList) {
			s.printAllDetails();
		}
	}
	
	public static void deleteStudent() {
		printMini();
		System.out.println("Enter the ID number of the student to delete");
		int toDelete = input.nextInt();
		
		boolean foundStudent = false;
		
		for(Student s: studentList) {
			if(toDelete==s.getStudentID());
			foundStudent= true;
			studentList.remove(s);
			System.out.println(s.getStudentName() + " has been removed");
			break;
		}
	
	if(foundStudent==false) {
		System.out.println("No studnet with id " + toDelete + " found");
	}}

	public static void clearList() {
		System.out.println("You are about to delete " + studentList.size() + " records");
		System.out.println("Are you sure? press y to continue press n to return to menu");
		
		String choice = input.next();
		choice = choice.toLowerCase();
		
		if(choice.equals("y")) {
			studentList.clear();
			System.out.println("Student List has been deleted");
			
		}
		
		studentList.clear();
		System.out.println("Student list has been deleted");
	}
	public static void menu() {
		System.out.println("Press 1 to Create a student");
		System.out.println("Press 2 to View all Students");
		System.out.println("Press 3 to edit a Studet");
		System.out.println("Press 4 to delete a Student");
		System.out.println("Press 5 to enter Student grades");
		System.out.println("Press X to Exit");
		
		String choice = input.next();
		
		switch(choice) {
		case "1": {
			createStudent();
			break;
		}
		case "2": {
			viewStudents();
			break;
		}
		case "4": {
			deleteStudent();
			break;
		}
		case "6":{
			clearList();
			break;
		}
		}
		
		menu();
	}
	
	
}
