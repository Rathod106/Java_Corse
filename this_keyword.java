import java.util.Scanner;
//Logic
	class Student {
	    String name;
	    int Rollno;

	    // Constructor to initialize name and age
	    public Student(String name, int Rollno) {
	        this.name = name;
	        this.Rollno = Rollno;
	    }

	    // Method to display Student details
	    public void display() {
	        System.out.println("Name: " + name + ", Rollno: " + Rollno);
	    }

	    // Method that passes 'this' (current object) to another class
	    public void passThis() {
	        // Passing the current Student object (this) to the Teacher constructor
	        Teacher teacher = new Teacher(this);
	        teacher.display();
	    }
	}

	// Class: Teacher
	class Teacher {
	    Student student;

	    // Constructor that receives a Student object as argument
	    public Teacher(Student student) {
	        this.student = student;
	    }

	    // Method to display Student details from Teacher class
	    public void display() {
	        System.out.println("Teacher is interacting with student:");
	        student.display();  // Calling display method of Student
	    }
	}

	public class this_Keyword {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Student student = new Student("Sonali", 24);

	        // Passing the current Student object to the Teacher constructor
	        student.passThis();
	    }
	}


*/Output
Teacher is interacting with student:
Name: Sonali, Rollno: 24
*/