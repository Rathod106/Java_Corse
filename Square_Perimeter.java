import java.util.Scanner; // Importing Scanner class for user input
public class Square_Perimeter {
	    public static void main(String[] args) {
	        // Creating a Scanner object for taking input
	        Scanner sc = new Scanner(System.in);

	        // enter the user for the side length of the square
	        System.out.print("Enter the length of the side of the square: ");
	        double side = sc.nextDouble(); // Reading double input

	        // Calculating the perimeter of the square
	        double perimeter = 4 * side; // Formula for perimeter: 4 × side length

	        // Displaying the result
	        System.out.println("The perimeter of the square is: " + perimeter);

	   
	    }
	}


*/Output
Enter the length of the side of the square: 12
The perimeter of the square is: 48.0
*/
