import java.util.Arrays;
public class ArraySort {
public static void main(String[] args) {
	        // Given array
	        int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};
	        
	        // Sort the array
	        Arrays.sort(numbers);
	        
	        // Output the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(numbers));
	    }
	} 

    /* Output
    Sorted array: [12, 20, 35, 45, 56, 67, 78, 78, 89]
    */