import java.util.Scanner;
class Person1
{
	String name;
	int age;

	// Constructor for Person class
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to print a message
	public void speak() {
		System.out.println(name + " is speaking.");
	}
}
class Student1 extends Person1 {
	String grade;

	// Constructor for Student class
	public Student1(String name, int age, String grade) {
		super(name, age);  // Call the constructor of Person
		this.grade = grade;
	}

	// Method to print a message about studying
	public void study() {
		System.out.println(name + " is studying for grade " + grade + ".");
	}
}
	public class Inheritance1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);

			// Taking input for student details
			System.out.print("Enter student's name: ");
			String name = scanner.nextLine();

			System.out.print("Enter student's age: ");
			int age = scanner.nextInt(); // Read integer input
			scanner.nextLine();

			System.out.print("Enter student's grade: ");
			String grade = scanner.nextLine();

			// Creating an object of the Student class using the input
			Student1 student = new Student1(name, age, grade);

			// Calling the methods of Student class
			student.speak();
			student.study();

		}

	}
*/Output
Enter student's name: Sonali
Enter student's age: 24
Enter student's grade: 87
Sonali is speaking.
Sonali is studying for grade 87.
*/