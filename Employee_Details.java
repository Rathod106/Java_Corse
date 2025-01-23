import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		// creating object for taking input
		Scanner sc=new Scanner(System.in);
		//enter the input
		System.out.print("Enter the EmployeeID:");
		int EmpID=sc.nextInt();
		System.out.print("Enter the EmployeeName:");
		String EmpName=sc.nextLine();
		System.out.print("Enter the EmployeeAddress:");
		String EmpAddress=sc.nextLine();
		System.out.print("Enter the EmployeeSal:");
		double EmpSal=sc.nextDouble();
				
		//Display the Entered all Details
		System.out.println("\n---Employee Details ---");
		System.out.println("Employee ID:"+EmpID);
		System.out.println("Employee Name:"+EmpName);
		System.out.println("Employee Address:"+EmpAddress);
		System.out.println("Employee Sal:"+EmpSal);
		sc.close();
		}

}


*/ Output
Employee ID: 101
Employee Name:Sonali
Employee Address:413219 Main Road,Akkalkot
Employee Salary: 50000
*/

