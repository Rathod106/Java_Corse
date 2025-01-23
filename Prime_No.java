import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//creating object
		//Enter the Input
		System.out.print("Enter a number to check if it is prime: ");
		int number = sc.nextInt();

		int count = 0; // Counter for divisors

		// Count divisors from 1 to the number
	    for (int i = 1; i <= number; i++) {
	    	if (number % i == 0) {
	    		count++;
	    		}
		        }

		        // the prime number has exactly two divisors: 1 and itself
		        if (count == 2) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }	        


	}

}



*/
Enter a number to check if it is prime: 5
5 is a prime number.
*/
